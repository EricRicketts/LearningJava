public class Factorial {
    int factR(int n) {
        int factorial;
        if (n == 1) return 1;
        factorial = factR(n - 1) * n;
        return factorial;
    }

    int factI(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i += 1) {
            factorial *= i;
        }
        return factorial;
    }
}
