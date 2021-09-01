public class UseFinally {
    public static String genException(int what) {
        String y = "";
        int t;
        int[] nums = new int[2];
        try {
            switch (what) {
                case 0: {
                    t = 10 / what;
                    break;
                }
                case 1: {
                    nums[4] = 4;
                    break;
                }
                case 2: {
                    y = "no exceptions generated";
                }
            }
        } catch (ArithmeticException e) {
            y = e.getMessage();
        } catch (ArrayIndexOutOfBoundsException e) {
            y = e.getMessage();
        } finally {
            y = y + " in final block";
        }
        return y + " " + "leaving method";
    }
}
