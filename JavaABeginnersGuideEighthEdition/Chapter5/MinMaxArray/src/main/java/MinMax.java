public class MinMax {

    int get_max(int[] ary) {
        int max = Integer.MIN_VALUE;
        int numberOfElements = ary.length;
        for (int n = 0; n < numberOfElements; n += 1) {
            if (ary[n] > max) max = ary[n];
        }
        return max;
    }
    int get_min(int[] ary) {
        int min = Integer.MAX_VALUE;
        int numberOfElements = ary.length;
        for (int n = 0; n < numberOfElements; n += 1) {
            if (ary[n] < min) min = ary[n];
        }
        return min;
    }
}
