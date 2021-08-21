package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        final double LBSToKILOS = 0.45359237;
        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;

        int myIntValue = 5 / 3;
        float myFloatValue = 5F / 3F;
        double myDoubleValue = 5D / 3D;

        System.out.println("Max Float: " + maxFloat + " Max Double: " + maxDouble);
        System.out.println("Min Float: " + minFloat + " Min Double: " + minDouble);
        System.out.println("Int value: " + myIntValue);
        System.out.println("Float value: " + myFloatValue);
        System.out.println("Double value: " + myDoubleValue);

        double numberOfPounds = 5;
        double numberOfKilos = LBSToKILOS * numberOfPounds;
        System.out.println("we have " + numberOfPounds + "lbs which is " + numberOfKilos + "kilos");

        double otherFormattedDouble = 3_000_000.4_567_981d;
        System.out.println(otherFormattedDouble);
    }
}
