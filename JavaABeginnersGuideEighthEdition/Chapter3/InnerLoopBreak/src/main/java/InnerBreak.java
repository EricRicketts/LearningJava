public class InnerBreak {

    public static int[] breakOnlyOutOfNearestLoop() {
        int[] results = new int[33];
        int index = 0;
        for (int i = 0; i < 3; i += 1) {
            results[index] = i;
            int j = 0;
            while (j < 100) {
                index += 1;
                results[index] = j;
                j += 1;
                if (j == 10) break;
            }
           index += 1;
        }
        return results;
    }
}
