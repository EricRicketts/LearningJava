package org.example;

public class TeenNumberChecker {

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        boolean hasTeen = false;
        if (isTeen(firstAge)) {
            hasTeen = true;
        } else if (isTeen(secondAge)) {
            hasTeen = true;
        } else if (isTeen(thirdAge)) {
            hasTeen = true;
        }
        return hasTeen;
    }

    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }
}
