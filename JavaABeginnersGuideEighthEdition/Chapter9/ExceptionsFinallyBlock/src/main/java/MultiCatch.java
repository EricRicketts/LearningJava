public class MultiCatch {
    public static String genException(int x) {
        int[] nums = new int[2];
        try {
            switch(x) {
                case 0: {
                    double y = 1 / x;
                    break;
                }
                case 1: {
                    nums[2] = 2;
                    break;
                }
            }
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            return e.getMessage();
        }
        return "No exception";
    }
}
