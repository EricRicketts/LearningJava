public class CastDemo {
    public static String castDoubleToInt() {
        double x = 10.0, y = 3.0;
        int i = (int)(x/y);
        StringBuilder sb = new StringBuilder("truncation of 10.0 / 3.0 to ")
                .append(Integer.toString(i)).append(" when cast as int");
        return sb.toString();
    }

    public static String castIntToByteNoLoss() {
        int i = 100;
        byte b = (byte) i;
        StringBuilder sb = new StringBuilder("No loss of information when casting int to byte when byte is ")
                .append(Byte.toString(b));
        return sb.toString();
    }

    public static String castIntToByteLoss() {
        int i = 300;
        byte b = (byte) i;
        StringBuilder sb = new StringBuilder("Loss of information when casting int of 300 to byte result is ")
                .append(Byte.toString(b));
        return sb.toString();
    }

    public static String castByteToChar() {
        byte b = 88;
        char ch = (char) b;
        StringBuilder sb = new StringBuilder("Can cast byte to a char byte is ")
                .append(Byte.toString(b)).append(" char is ").append(Character.toString(ch));
        return sb.toString();
    }
}
