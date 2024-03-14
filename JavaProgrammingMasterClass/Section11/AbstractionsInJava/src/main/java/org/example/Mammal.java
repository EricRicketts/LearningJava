package org.example;

abstract class Mammal extends Animal {

    // in this case Mammal overrides the Animal move method.  A subclassed abstract method can override all of the
    // parent abstract methods, some of them, or none of them.
    @Override
    public String move(String speed) {
        String pace = speed.equalsIgnoreCase("slow") ? "walks" : "runs";
        return getExplicitType() + " " + pace;
    }

    // extended abstract classes can introduce their own abstract methods
    public abstract String shedHair();

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }
}
