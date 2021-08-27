public class StaticBlock {
    static double rootOf3;
    static double rootOf2;
    String msg;

    static {
        rootOf2 = Math.sqrt(2);
        rootOf3 = Math.sqrt(3);
    }

    StaticBlock(String message) {
        msg = message;
    }
}
