import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    private Vehicle minivan, sportscar;

    @BeforeEach
    void setUpBeforeEach() {
       minivan = new Vehicle();
       sportscar = new Vehicle();
       minivan.passengers = 7; minivan.mpg = 21; minivan.fuelCap = 16;
       sportscar.passengers = 2; sportscar.mpg = 12; sportscar.fuelCap = 14;
    }

    @Test
    void minivan() {
        String expected = "The minivan has a capacity of 7 passengers and a range of 336 miles.";
        StringBuilder results = new StringBuilder("The minivan has a capacity of ")
                .append(Integer.toString(minivan.passengers)).append(" passengers and a range of ")
                .append(Integer.toString(minivan.mpg * minivan.fuelCap)).append(" miles.");
        assertEquals(expected, results.toString());
    }

    @Test
    void sportscar() {
        String expected = "The sports car has a capacity of 2 passengers and a range of 168 miles.";
        StringBuilder results = new StringBuilder("The sports car has a capacity of ")
                .append(Integer.toString(sportscar.passengers)).append(" passengers and a range of ")
                .append(Integer.toString(sportscar.mpg * sportscar.fuelCap)).append(" miles.");
        assertEquals(expected, results.toString());
    }
}