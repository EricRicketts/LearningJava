public class Main {

    public static void main(String[] args) {
        int[][] weightArray = {{1, 0, 4}, {1, 0, 5}, {0, 5, 4}, {2, 2, 11}, {2, 1, 5}, {-3, 2, 12}};
        for (int[] weights: weightArray) {
            System.out.println(FlourPacker.canPack(weights[0], weights[1], weights[2]));
        }
    }
}
