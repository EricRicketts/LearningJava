public class CharArithDemo {

    public static String main() {
        StringBuilder result = new StringBuilder();
        char[] charArray = new char[3];
        char ch = 'X';
        charArray[0] = ch;
        ch++; // we can increment chars just like integers
        charArray[1] = ch;
        ch = 90; // we can assign numeric values to char
        charArray[2] = ch;

        for (char c: charArray) {
            result.append(" ").append(Character.toString(c));
        }
        return result.toString();
    }
}
