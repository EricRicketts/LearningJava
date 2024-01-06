package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringBuilderTest {

    String s;
    StringBuilder sb;

    @BeforeEach
    public void setUp() {
        s = "one two three";
        sb = new StringBuilder("one two three");
    }

    @Test
    public void testStringImmutability() {
        int expected = 13;
        int result = s.length();
        Assertions.assertEquals(expected, result);
        String newString = s.concat(" four");
        String expectedString = "one two three four";
        Assertions.assertEquals(expectedString, newString);
        // Strings are immutable so the original String "one two three" remains unchanged
        // with the concat method a new String was returned
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testStringBuilderMutability() {
        int expected = 13;
        int result = sb.length();
        Assertions.assertEquals(expected, result);
        sb.append(" four");
        StringBuilder expectedStringBuilder = new StringBuilder("one two three four");
        // comparison returns 0 if the sequence of character is the same
        // notice sb mutated from its original value
        Assertions.assertEquals(0, expectedStringBuilder.compareTo(sb));
    }

    @Test
    public void testStringBuilderCapacity() {
        // jdk sets the initial capacity
        int initialCapacity = 29;
        Assertions.assertEquals(initialCapacity, sb.capacity());
        sb.append(" one two three ".repeat(2));
        // set by the JDK I had to run a failing test first
        int newCapacity = 60;
        Assertions.assertEquals(newCapacity, sb.capacity());
    }
}
