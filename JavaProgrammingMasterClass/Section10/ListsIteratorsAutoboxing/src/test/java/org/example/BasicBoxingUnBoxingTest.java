package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicBoxingUnBoxingTest {

    @Test
    public void testFactoryMethod() {
        Integer boxedInt = Integer.valueOf(15); // preferred over new Integer; but unnecessary
        Assertions.assertEquals("java.lang.Integer", boxedInt.getClass().getName());
        // note new Integer(int value) is deprecated since JDK 9 avoid its use
    }

    @Test
    public void testDirectAssignment() {
        Integer autoBoxedInt = 15; //
        int autoUnboxedInt = autoBoxedInt;
       Assertions.assertEquals("java.lang.Integer", Integer.valueOf(autoUnboxedInt).getClass().getName());
       // best we can do here is to manually box the primitive value and then see if we get the boxed class
    }
}
