import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    private int x, y, z;
    private Vehicle car1, car2, car3;

    @BeforeEach
    void setUp() {
        x = 10;
        y = x;
        z = 20;
        car1 = new Vehicle();
        car2 = car1;
        car3 = new Vehicle();
        car1.passengers = 4;
        car3.passengers = 7;
    }

    @Test
    void primitiveAssignments() {
        assertEquals(x, y);
        assertEquals(20, z);
    }

    @Test
    void sameObjectReferences() {
        assertEquals(car1.passengers, car2.passengers);
    }

    @Test
    void differentObjectReferences() {
        assertNotEquals(car3.passengers, car2.passengers);
    }

    @Test
    void changingObjectReferences() {
        car2 = car3;
        assertEquals(car3.passengers, car2.passengers);
    }
}