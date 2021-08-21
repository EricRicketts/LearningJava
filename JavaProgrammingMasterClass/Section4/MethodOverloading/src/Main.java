public class Main {
    public static final double InchesToCentimeters = 2.54d;
    public static final double FeetToInches = 12d;

    public static void main(String[] args) {
        System.out.println(calculateFeetAndInchesToCentimeters(25));
        System.out.println(calculateFeetAndInchesToCentimeters(2, 9));
        System.out.println(calculateFeetAndInchesToCentimeters(7, 5));
    }

    public static double calculateFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 12)) {
            return -1;
        }
        return (feet * FeetToInches + inches) * InchesToCentimeters;
    }

    public static double calculateFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        int feet = (int) (inches / FeetToInches);
        int remainingInches = (int) (inches % FeetToInches);

        return calculateFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
