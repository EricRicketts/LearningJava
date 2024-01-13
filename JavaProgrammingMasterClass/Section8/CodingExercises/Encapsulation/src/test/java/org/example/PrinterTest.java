package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrinterTest {

    Printer printer, printerDuplex;

    @BeforeEach
    public void setUp() {
        printerDuplex = new Printer(50, true);
        printer = new Printer(50, false);
    }

    @Test
    public void testInitialPagesForDuplexPrinter() {
        Assertions.assertEquals(0, printerDuplex.getPagesPrinted());
    }

    @Test
    public void testInitialPagesForNonDuplexPrinter() {
        Assertions.assertEquals(0, printer.getPagesPrinted());
    }

    @Test
    public void testAddTonerToHighLimitDuplexPrinter() {
        Assertions.assertEquals(100, printerDuplex.addToner(50));
    }

    @Test
    public void testAddTonerToHighLimitNonDuplexPrinter() {
        Assertions.assertEquals(100, printer.addToner(50));
    }

    @Test
    public void testAddExcessiveToner() {
        Assertions.assertEquals(-1, printerDuplex.addToner(60));
    }

    @Test
    public void testRemoveTooMuchToner() {
        Assertions.assertEquals(-1, printer.addToner(-60));
    }
}
