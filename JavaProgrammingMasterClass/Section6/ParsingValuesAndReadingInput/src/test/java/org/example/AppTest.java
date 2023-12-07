package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AppTest {

    @Test
    public void testStringToIntegerExample() {
        Assertions.assertEquals(
                24,
                App.stringToIntegerConversion()
        );
    }
}
