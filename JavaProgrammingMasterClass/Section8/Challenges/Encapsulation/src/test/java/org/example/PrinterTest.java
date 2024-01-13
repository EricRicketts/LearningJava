package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;

public class PrinterTest {

    private Printer printer, printerDuplex;

    @BeforeEach
    public void setUp() {
        printer = new Printer(50, 100, false);
        printerDuplex = new Printer(50, 100, true);
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

    @Test
    public void testDuplexPrinterEvenPages() throws Exception {
        String text = tapSystemOut(() -> {
            printerDuplex.printPages(20);
        });
        Assertions.assertEquals(110, printerDuplex.getPagesPrinted());
        Assertions.assertEquals("Duplex printer.", text.trim());
    }

    @Test
    public void testDuplexPrinterOddPages() throws Exception {
        // if given 31 pages to print the duplex printer should print
        // 15 * 2 = 30 pages plus 1 remaining page for a total of 16 pages
        String text = tapSystemOut(() -> {
            printerDuplex.printPages(31);
        });
        Assertions.assertEquals(116, printerDuplex.getPagesPrinted());
        Assertions.assertEquals("Duplex printer.", text.trim());
    }

    @Test
    public void testReturnValueForPrintPagesDuplexEvenPages() throws Exception {
        String text = tapSystemOut(() -> {
            Assertions.assertEquals(15, printerDuplex.printPages(30));
        });
        Assertions.assertEquals("Duplex printer.", text.trim());
    }

    @Test
    public void testReturnValueForPrintPagesDuplexOddPages() throws Exception {
        String text = tapSystemOut(() -> {
            Assertions.assertEquals(21, printerDuplex.printPages(41));
        });
        Assertions.assertEquals("Duplex printer.", text.trim());
    }
}
