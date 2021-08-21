public class ScopeDemo {

    public static String blockScope(int x) {
        String result;
        if (x == 10) {
            int y = 11;
            result = "x (outer scope) is: " + Integer.toString(x)
                    + " y (current scope) is: " + Integer.toString(y);
            return result;
        }
        result = "x (outer scope) is: " + Integer.toString(x);
        return result;
    }

    public static String varInitDemo() {
        StringBuilder result = new StringBuilder();
        // y gets reinitialized each time through the loop
        for (int x = 0; x < 2; x++) {
            int y = 1;
            result.append(" y is: ").append(Integer.toString(y));
            y = 100;
            result.append(" y is now: ").append(Integer.toString(y));
        }
        return result.toString();
    }

}
