import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {

    private Truck semi, pickup;
    @BeforeEach
    void setUp() {
        semi = new Truck(2, 200, 7, 44_000);
        pickup = new Truck(3, 28, 15, 2_000);
    }
    @Test
    void getCargocap() {
        int[] expected = new int[]{44_000, 2_000};
        int[] results = new int[]{semi.getCargocap(), pickup.getCargocap()};
        assertArrayEquals(expected, results);
    }

    @Test
    void setCargocap() {
        semi.setCargocap(54_000);
        pickup.setCargocap(3_000);
        int[] expected = new int[]{54_000, 3_000};
        int[] results = new int[]{semi.getCargocap(), pickup.getCargocap()};
        assertArrayEquals(expected, results);
    }

    @Test
    void fuelneeded() {
        double[] expected = new double[]{70.0, 20.0};
        double[] results = new double[]{semi.fuelneeded(490), pickup.fuelneeded(300)};
        assertArrayEquals(expected, results);
    }
}