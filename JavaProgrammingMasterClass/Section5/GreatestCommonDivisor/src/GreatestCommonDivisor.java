public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int n1, int n2) {
        int smaller, bigger, greatestCommonDivisor = 1;
        if (n1 < 10 || n2 < 10) return -1;
        if (n1 <= n2) {
            smaller = n1;
            bigger = n2;
        } else {
            smaller = n2;
            bigger = n1;
        }
        for (int i = 2; i <= smaller; i +=1) {
            if (smaller % i == 0 && bigger % i == 0) greatestCommonDivisor = i;
        }
        return greatestCommonDivisor;
    }
}

/*
    1.  find the smaller of the two numbers
    2.  use a for loop start at i = 2, then go to smaller / 2 + 1 but increments of 1
    3.  set maxInteger = small % 2 == 0 and big % 2 == 0
    4.  return maxInteger
*/

