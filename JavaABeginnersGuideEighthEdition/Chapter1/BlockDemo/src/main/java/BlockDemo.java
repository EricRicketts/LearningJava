public class BlockDemo {

    public static String main(double i) {
        double j = 5, d;

        if (i != 0) {
            d = j / i;
            return "result of division is: " + Double.toString(d);
        } else {
            return "cannot divide by 0";
        }

    }
}
