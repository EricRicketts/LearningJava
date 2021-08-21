public class Example3 {
    public static String[] main() {
        int v = 10;
        double x = 10.0;

        String original = "Original value of v: " + Integer.toString(v) +
            " Original value of x: " + Double.toString(x);

        v = v / 4;
        x = x / 4;

       String modified = "v after division: " + Integer.toString(v) +
            " x after division: " + Double.toString(x);

       return new String[]{original, modified};
    }
}
