package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;

public class BedroomTest {

    private Wall wall1, wall2, wall3, wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;
    private Bedroom bedRoom;

    @BeforeEach
    public void setUp() {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);
        bedRoom = new Bedroom("Master", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
    }

    @Test
    public void testMakeBed() throws Exception {
        String text = tapSystemOut(() -> {
            bedRoom.makeBed();
        });
        Assertions.assertEquals("Making the bed.", text.trim());
    }

    @Test
    public void testTurnOnLamp() throws Exception {
        String text = tapSystemOut(() -> {
            bedRoom.getLamp().turnOn();
        });
        Assertions.assertEquals("The lamp is being turned on.", text.trim());
    }
}
