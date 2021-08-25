public class MethodOverloading {
    String ov1Demo() {
        return "no parameters";
    }

    int ov1Demo(int i) {
        return i;
    }

    int ov1Demo(int i, int j) {
        return i + j;
    }

    double ov1Demo(double a, double b) {
        return a - b;
    }
}
