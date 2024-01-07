package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    Rectangle rectangle;

    @BeforeEach
    public void setUp() {
        rectangle = new Rectangle(5, 10);
    }

    @Test
    public void testGetWidthOfRectangle() {
        Assertions.assertEquals(5, rectangle.getWidth());
    }

    @Test
    public void testGetLengthOfRectangle() {
        Assertions.assertEquals(10, rectangle.getLength());
    }

    @Test
    public void testGetAreaOfRectangle() {
        Assertions.assertEquals(50, rectangle.getArea());
    }
}
