package org.example;

public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public String getEarShape() {
        return earShape;
    }

    public void setEarShape(String earShape) {
        this.earShape = earShape;
    }

    public String getTailShape() {
        return tailShape;
    }

    public void setTailShape(String tailShape) {
        this.tailShape = tailShape;
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
        // this is a case were we might have a lot of dogs with a perky ear shape
        // and a curled tail shape
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
        // in this constructor we make the call to Animal via super() we cannot determine size before
        // the call to super as super must be the first line in the constructor, so we have to put
        // the ternary operation in the call to super
    }

    @Override
    public String move(String speed) {
        String movement = super.move(speed) + "\nIn general dogs walk, run, and wag their tails.";
        if (speed.equals("slow") || speed.equals("slowly")) {
            movement += (this.walk() + this.wagTail());
        } else {
            movement += (this.run() + this.bark());
        }

        return movement;
    }
    /*
        This is a very important concept, illustrated by overriding the toString method below and the move
        method above.  The @Override is an annotation indicating we are overriding the method from the parent
        class.  In the move method note there is a call to the parent method using super, we then concat
        another string to extend the content to the return value of the child version of the move method.

        Java will always call the overridden child method if such a method does not exist then it calls the
        inherited parent method.
    */

    // in this part of the code we are adding methods unique to Dog
    private String bark() { return "\n" + this.getType() + " says Woof!"; }

    private String run() { return "\n" + this.getType() + " is running."; }

    private String wagTail() { return "\n" + this.getType() + " is wagging it's tail."; }

    private String walk() { return "\n" + this.getType() + " is walking."; }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
