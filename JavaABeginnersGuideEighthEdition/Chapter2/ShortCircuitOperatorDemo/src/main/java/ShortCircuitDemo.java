public class ShortCircuitDemo {

    public static String sideEffects() {
        int x = 0;
        StringBuilder result = new StringBuilder();

        if (false & (++x < 10)) {
            result.append("x is incremented to ").append(Integer.toString(x));
        }
        if (false && (++x < 10)) {
            result.append(" x is not incremented it remains ").append(Integer.toString(x));
        }
        result.append("x is incremented to: ").append(Integer.toString(x)).append(" and not incremented further.");
        return result.toString();
    }
}
