public class Vehicle {
    int passenger, mpg, fuelCap;
    Vehicle(int p, int f, int m) {
        passenger = p;
        fuelCap = f;
        mpg = m;
    }

    double fuelNeeded(int miles) {
        return (double)(miles / mpg);
    }

    int range() {
        return mpg * fuelCap;
    }
}
