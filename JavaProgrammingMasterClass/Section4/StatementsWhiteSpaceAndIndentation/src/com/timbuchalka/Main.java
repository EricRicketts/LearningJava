package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50; // expression part of this statement is myVariable = 50
        // statement includes type keyword and semicolon
        System.out.println("Current value of myVariable is: " + myVariable); // statement
        myVariable++; // statement
        System.out.println("Current value of myVariable is: " + myVariable); // statement
        myVariable--; // statement
        System.out.println("Current value of myVariable is: " + myVariable); // statement
        System.out.println("This is" +
                " another" +
                " still more."); // statements can span multiple lines
        // multiple statements on one line not recommended
        int anotherVariable = 51; myVariable--;System.out.println("all three statements on the same line.");
    }
}
