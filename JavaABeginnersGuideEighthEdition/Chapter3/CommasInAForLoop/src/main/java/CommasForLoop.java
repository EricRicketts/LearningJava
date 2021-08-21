public class CommasForLoop {

    public static int[][] useCommasForLoop() {
        int[][] results = new int[6][2];
        for (int i = 0, j = 10; i <= j; i++, j--) {
            int[] element = new int[2];
            element[0] = i;
            element[1] = j;
            results[i] = element;
        }
        return results;
    }
}
