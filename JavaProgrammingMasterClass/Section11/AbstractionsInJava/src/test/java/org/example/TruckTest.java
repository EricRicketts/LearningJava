package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TruckTest {

    private Truck truck;

    @BeforeEach
    public void setUp() {
        truck = new Truck();
    }

    @Test
    public void testTruckTrackableMethods() {
        Assertions.assertEquals(
                "Truck is being tracked by the broadcast signal from its internal navigation system.",
                truck.track()
        );
    }
}
