public class Truck extends Vehicle {
    private int cargocap;

    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargocap = c;
    }

    int getCargocap() { return cargocap; }
    void setCargocap(int c) { cargocap = c; }
}
