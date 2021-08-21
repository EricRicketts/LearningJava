public class PromotionDemo {

    public static String integerBackToByte() {
        byte b;
        int i;
        b = 10;
        i = b * b; // no cast needed
        StringBuilder sb = new StringBuilder("int from bytes, no cast needed i = ").append(Integer.toString(i));
        b = (byte)(b * b); // cast needed
        sb.append(" cast needed for byte * byte b = ").append(Byte.toString(b));

        return sb.toString();
    }

    public static String charBackToChar() {
        char ch1 = 'a', ch2 = 'b', ch3;
        ch3 = (char) (ch1 + ch2);
        int ch4 = (int) ch3;
        return "concat two chars need type cast, 'a' + 'b' is integer value: " + Integer.toString(ch4);
    }
}
