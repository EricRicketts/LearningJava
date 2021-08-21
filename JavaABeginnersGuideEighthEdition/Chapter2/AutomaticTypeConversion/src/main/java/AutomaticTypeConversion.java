public class AutomaticTypeConversion {
/*
    Automatic type conversion will take place under the following two conditions:
    1.  The types are compatible
    2.  The destination type is larger than the source type.
*/
    public static double longToDouble(long x) {
        double y = x; // both long and double are numbers, double has a larger numeric space than double
        return y;
    }

    public static int charToInt(char c) {
        int x = c; // though char is not a number it can be assigned a number, which is a Unicode number which
        // has the same range as a 16-bit number, since int is 32 bits in width it is the larger type
        return x;
    }
}
