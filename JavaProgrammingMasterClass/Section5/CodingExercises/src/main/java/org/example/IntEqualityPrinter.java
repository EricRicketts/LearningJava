package org.example;

public class IntEqualityPrinter {

    public static String returnEqual(int firstInt, int secondInt, int thirdInt) {
        String comparisonResult = "Invalid Value";
        if (firstInt < 0 || secondInt < 0 || thirdInt < 0) {
            return comparisonResult;
        } else if (firstInt == secondInt && secondInt == thirdInt) {
            comparisonResult = "All numbers are equal";
        } else if (firstInt == secondInt || secondInt == thirdInt) {
            comparisonResult = "Neither all are equal or different";
        } else if (firstInt != thirdInt) {
            comparisonResult = "All numbers are different";
        } else {
            comparisonResult = "Neither all are equal or different";
        }

        return comparisonResult;
    }

    public static void printEqual(int firstInt, int secondInt, int thirdInt) {
        String comparisonResult = "Invalid Value";
        if (firstInt < 0 || secondInt < 0 || thirdInt < 0) {
            System.out.println(comparisonResult);
            return;
        } else if (firstInt == secondInt && secondInt == thirdInt) {
            comparisonResult = "All numbers are equal";
        } else if (firstInt == secondInt || secondInt == thirdInt) {
            comparisonResult = "Neither all are equal or different";
        } else if (firstInt != thirdInt) {
            comparisonResult = "All numbers are different";
        } else {
            comparisonResult = "Neither all are equal or different";
        }

        System.out.println(comparisonResult);
    }
}
