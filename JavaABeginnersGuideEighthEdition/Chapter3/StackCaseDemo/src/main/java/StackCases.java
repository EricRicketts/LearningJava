public class StackCases {

    public static String main(int x) {
        String result;
        switch(x) {
            case 1: case 2: case 3:
            case 4: {
                result = "x is 1, 2, 3, or 4";
                break;
            }
            default: {
                result = "x is not 1, 2, 3, or 4";
            }
        }
        return result;
    }
}
