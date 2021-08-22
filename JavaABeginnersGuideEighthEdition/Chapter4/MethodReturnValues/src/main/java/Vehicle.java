public class Vehicle {
    int passengers;
    int mpg;
    int fuelCap;

    double fuelNeeded (int miles) {
        return (double) (miles/mpg);
    }

    int range() {
        return mpg * fuelCap;
    }
}
