public class Vehicle {
    int passengers;
    int mpg;
    int fuelCap;

    int range() {
        return mpg * fuelCap;
    }
}
