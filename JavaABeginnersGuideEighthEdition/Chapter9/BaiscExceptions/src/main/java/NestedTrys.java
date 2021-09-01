public class NestedTrys {
    public Object[] demonstrateExceptions() {
        int[] numerator = new int[]{2, 4, 6, 8, 10};
        int[] denominator = new int[]{2, 0, 2, 0};
        Object[] values = new Object[5];
        int index = 0;
        try {
            for (index = 0; index < numerator.length; index++) {
                try {
                    values[index] = numerator[index] / denominator[index];
                } catch (ArithmeticException e) {
                    values[index] = e.getMessage();
                }
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            values[index] = e.getMessage();
        }
        return values;
    }
}
