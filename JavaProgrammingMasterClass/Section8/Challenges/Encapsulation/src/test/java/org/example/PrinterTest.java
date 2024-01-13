package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrinterTest {

    private Printer printer;

    @BeforeEach
    public void setUp() {
        printer = new Printer(50, 100, false);
    }

    @Test
    public void testLowToner() {
        Assertions.assertEquals(-1, printer.addToner(-60));
        Assertions.assertEquals(-1, printer.getTonerLevel());
    }

    @Test
    public void testHighTonerLevel() {
        Assertions.assertEquals(100, printer.addToner(100));
        Assertions.assertEquals(100, printer.getTonerLevel());
    }

    @Test
    public void testNormalTonerLevelRange() {
        Assertions.assertEquals(70, printer.addToner(20));
        Assertions.assertEquals(50, printer.addToner(-20));
    }

    @Test
    public void testNonDuplexPrinter() {
        Assertions.assertEquals(17, printer.printPages(17));
        Assertions.assertEquals(117, printer.getPagesPrinted());
    }
}
