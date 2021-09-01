public class ExecDemo {
    public Object[] demonstrateExceptions() {
        int[] numerator = new int[]{2, 4, 6, 8};
        int[] denominator = new int[]{2, 0, 2, 0};
        Object[] values = new Object[4];
        for (int i = 0; i < numerator.length; i += 1) {
            try {
                values[i] = numerator[i]/denominator[i];
            }
            catch (ArithmeticException e) {
                values[i] = e.getMessage();
            }
        }
        return values;
    }
}
