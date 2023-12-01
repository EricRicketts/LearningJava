package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppTest {

    @Test
    public void testLoadNumbers() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        List<Integer> numbers = App.addNumbersToList(6);
        Assertions.assertEquals(
                expected,
                numbers
        );
    }

    @Test
    public void testInterestRate() {
        // note we can use types other than int in a for loop
        for (double rate = 2.0; rate <= 5.0; rate++) {
            Assertions.assertEquals(
                    rate * 100,
                    App.calculateInterest(10_000, rate)
            );
        }
    }

    @Test
    public void testInterestRateSmallerIncrements() {
        for (double rate = 7.5; rate < 10.0; rate+=0.25) {
            Assertions.assertEquals(
                    rate,
                    App.calculateInterest(100, rate)
            );
        }
    }

    @Test
    public void testInterestRateBreakCondition() {
        for (double rate = 7.5; rate < 10.0; rate+=0.25) {
            double interest = App.calculateInterest(100, rate);
            if (interest > 8.5) break;
            Assertions.assertEquals(
                    rate,
                    interest
            );
        }
    }
}
