public class IfDemo {
    public static String main() {
        int a = 2, b = 3, c;
        String result;

        if (a < b) {
            result = "a is less than b.";
        } else {
            result = "";
        }

        c = a - b;

        if (c < 0) result += " c is less than zero.";

        c = b - a;

        if (c > 0) result += " c is greater than zero.";

        return result;
    }
}
