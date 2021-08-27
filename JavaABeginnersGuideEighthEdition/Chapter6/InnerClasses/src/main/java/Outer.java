public class Outer {
    double[] nums;

    Outer(double[] n) {
        nums = n;
    }

    double[] results() {
        Inner ob = new Inner();
        return new double[]{ob.min(), ob.max(), ob.avg() };
    }


    class Inner {
        double avg() {
            double avg = 0;
            double sum = 0;
            int numberOfItems = nums.length;
            for (double n: nums) {
                sum += n;
            }
            return sum / numberOfItems;
        }

        double max() {
            double max = Double.MIN_VALUE;
            for (int i = 0; i < nums.length; i += 1) {
                if (nums[i] > max) max = nums[i];
            }
            return max;
        }

        double min() {
            double min = Double.MAX_VALUE;
            for (int i = 0; i < nums.length; i += 1) {
                if (nums[i] < min) min = nums[i];
            }
            return min;
        }

    }
}
