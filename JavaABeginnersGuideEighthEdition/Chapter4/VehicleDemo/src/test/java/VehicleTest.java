import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    private Vehicle myCar;

    @BeforeEach
    public void initEach() {
        myCar = new Vehicle();
    }
    @Test
    void passengers() {
        myCar.passengers = 4;
        assertEquals(4, myCar.passengers);
    }

    @Test
    void mpgAndFuelCapacity() {
        myCar.mpg = 30;
        myCar.fuelcap = 10;
        assertEquals(300, myCar.mpg * myCar.fuelcap);
    }
}