package xyz;
import abc.Addition;

public class Subtraction extends Addition {
    int subtractTwoNumbers(int a, int b) {
        return a - b;
    }
    int addAndSubtract(int a, int b) {
        return addTwoNumbers(a, b) + subtractTwoNumbers(a, b);
    }
}
