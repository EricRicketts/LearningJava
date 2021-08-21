package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("My string is equal to: " + myString);
        String myNewString = myString + ", this is more.";
        System.out.println("My new string is equal to: " + myNewString);

        String myNumberString = "250.55";
        String myNewNumberString = myNumberString + "49.95";
        System.out.println(myNewNumberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
    }
}
