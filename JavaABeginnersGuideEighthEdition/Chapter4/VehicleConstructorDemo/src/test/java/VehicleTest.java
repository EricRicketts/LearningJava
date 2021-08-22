import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Vehicle minivan, sportsCar;
    private double gallons;
    private int dist = 252;

    @BeforeEach
    void setUp() {
        minivan = new Vehicle(7, 16, 21);
        sportsCar = new Vehicle(2, 14, 21);
    }

    @Test
    void fuelNeeded() {
        assertEquals(12.0, minivan.fuelNeeded(dist));
    }

    @Test
    void range() {
        assertEquals(294, sportsCar.range());
    }
}