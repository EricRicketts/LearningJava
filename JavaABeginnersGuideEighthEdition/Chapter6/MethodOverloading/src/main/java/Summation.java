public class Summation {
    int sum;

    Summation(int num) {
        sum = 0;
        for (int i = 1; i <= num; i += 1) {
            sum += i;
        }
    }

    Summation(Summation ob) {
        sum = ob.sum;
    }
}
/*
    An example of initializing one object with another object
*/
