public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);
        // to convert a string to a number we can use Integer.parseInt()
        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);
        numberAsString += 1; // converts 1 to string and concatenates
        // above would throw an exception if numberAsString was "2018a"
        number += 1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        String numberAsStringTwo = "2018.125";
        System.out.println("numberAsStringTwo = " + numberAsStringTwo);
        double numberTwo = Double.parseDouble(numberAsStringTwo);
        System.out.println("numberTwo = " + numberTwo);
        numberAsStringTwo += 1;
        numberTwo += 1;
        System.out.println("numberAsStringTwo = " + numberAsStringTwo);
        System.out.println("numberTwo = " + numberTwo);
    }
}
