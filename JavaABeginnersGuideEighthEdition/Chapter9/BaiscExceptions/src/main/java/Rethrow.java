public class Rethrow {
    public static void genException() {
        int[] numerator = {2, 4, 8, 16, 32, 64, 128, 256, 512};
        int[] denominator = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < numerator.length; i++) {
            try {
                int x = numerator[i] / denominator[i];
            } catch (ArithmeticException e) {
                String y = e.getMessage();
            } catch (ArrayIndexOutOfBoundsException e) {
                String z = e.getMessage();
                throw e;
            }
        }
    }
}
