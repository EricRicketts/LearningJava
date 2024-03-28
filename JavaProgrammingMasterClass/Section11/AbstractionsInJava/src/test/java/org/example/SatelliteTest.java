package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SatelliteTest {

    private Satellite satellite;
    private String expected, results;

    @BeforeEach
    public void setUp() {
        satellite = new Satellite();
    }

    @Test
    public void testTakeOff() {
       expected = "Satellite taking off. Monitoring LAUNCH from the ground station.";
       results = satellite.takeOff();
        Assertions.assertEquals(expected, results);
        /*
            What leads to this output?  It is very important to trace the method calls in this case.  Satellite
            implements the OrbitEarth Interface.  However, the OrbitEarth Interface extends the FlightEnabled
            Interface, meaning the OrbitEarth Interface inherits the abstract takeOff() method from FlightEnabled.
            However, since takeOff() is defined as an abstract method in FlightEnabled, where is the implementation?
            Fortunately, we do not have to look very far, the takeOff() method is overridden in the Satellite class.
            @Override
            public String takeOff() { return className + transition(" taking off."); }
            Note it calls the transition() method which is the Satellite class itself.
                public String transition(String description) {
                stage = transition(stage); // this is the OrbitEarth transition method
                return description + " " + stage.track();
                }
            However in the body of the Satellite's transition method it calls the transition method from the OrbitEarth
            Interface.
                @Override
                default FlightStages transition(FlightStages stage) {
                FlightStages nextStage = FlightEnabled.super.transition(stage);
                transitionDescriptions.add(logStage(stage, "Beginning transition to " + nextStage));
                return nextStage;
                }
                Note the transition method from the Satellite class returns a String but the transition method from
                OrbitEarth Interface returns a FlightStages object.  The end result is that a string is returned and
                the flight stage of the Satellite is advanced.
        */
    }

    @Test
    public void testAchieveOrbit() {
        satellite.transition("to CRUISE");
        expected = "Satellite has achieved orbit. Monitoring CRUISE from the ground station.";
        results = satellite.achieveOrbit();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testFly() {
        satellite.transition("to CRUISE");
        satellite.transition("to DATA_COLLECTION");
        expected = "Satellite maintaining orbit. " +
                "Monitoring DATA_COLLECTION from the ground station. " +
                "Currently engaging in data collection.";
        results = satellite.fly();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testLand() {
        satellite.transition("to CRUISE");
        satellite.transition("to DATA_COLLECTION");
        satellite.transition("to GROUNDED");
        expected = "Satellite is landing. Not currently tracking.";
        results = satellite.land();
        Assertions.assertEquals(expected, results);
    }
}
