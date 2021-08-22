import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    private Vehicle minivan, sportsCar;

    @BeforeEach
    void setUp() {
       minivan = new Vehicle();
       sportsCar = new Vehicle();
       minivan.passengers = 7;
       minivan.mpg = 25;
       minivan.fuelCap = 20;
       sportsCar.passengers = 2;
       sportsCar.mpg = 15;
       sportsCar.fuelCap = 15;
    }

    @Test
    void range() {
        int[] expected = {500, 225};
        int[] results = new int[2];
        results[0] = minivan.range();
        results[1] = sportsCar.range();
        assertArrayEquals(expected, results);
    }
}