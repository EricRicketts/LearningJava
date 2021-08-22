public class Pwr {
    double b;
    int e;
    double val;

    Pwr(double base, int exp) {
        b = base;
        e = exp;
        val = 1.0;
        if (exp == 0) return;
        for (; exp > 0; exp -= 1) val = val * base;
    }

    double[] get_pwr() {
        double val = 3.0; // without "this" below the local variable would hide the instance variable (take precedence)
        return new double[]{val, this.val};
    }

}
