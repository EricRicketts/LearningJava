public class Vehicle {
    private int passengers;
    private int fuelcap;
    private int mpg;

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range() {
        return fuelcap * mpg;
    }

    double fuelneeded(int miles) {
        return (double) (miles / mpg);
    }

    int getFuelcap() { return fuelcap; }
    int getMpg() { return mpg; }
    int getPassengers() { return passengers; }
    void setFuelcap(int f) { fuelcap = f; }
    void setMpg(int m) { mpg = m; }
    void setPassengers(int p) { passengers = p; }
}
