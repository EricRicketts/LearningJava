package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void testPrintPagesNonDuplex() {
        Assertions.assertEquals(13, printer.printPages(13));
        Assertions.assertEquals(13, printer.getPagesPrinted());
    }

    @Test
    public void testPrintPagesDuplex() {
        Assertions.assertEquals(7, printerDuplex.printPages(13));
        Assertions.assertEquals(7, printerDuplex.getPagesPrinted());
    }

    @Test
    public void testCourseExampleDataDuplexPrinterFourPages() {
        Assertions.assertEquals(2, printerDuplex.printPages(4));
        Assertions.assertEquals(2, printerDuplex.getPagesPrinted());
        Assertions.assertEquals(1, printerDuplex.printPages(2));
        Assertions.assertEquals(3, printerDuplex.getPagesPrinted());
    }

    @Test
    public void testCourseData() {
        Object[][] inputs = {
           {0, false}, {50, true}, {-10, false},
           {100, true}, {105, false}, {75, false},
           {25, true}
        };
        for (int row = 0; row < inputs.length; row++) {
            Object[] tonerLevelAndDuplexSetting = inputs[row];
            Integer tonerLevel = (Integer) tonerLevelAndDuplexSetting[0];
            Boolean duplexSetting = (Boolean) tonerLevelAndDuplexSetting[1];
            printer = new Printer(tonerLevel, duplexSetting);
            Assertions.assertEquals(0, printer.getPagesPrinted());
        }
    }

}
