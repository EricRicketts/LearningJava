package org.example;

public class Printer {

    private int tonerLevel, pagesPrinted;
    private final boolean duplex;

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        int totalTonerAmount = this.tonerLevel + tonerAmount;
        totalTonerAmount = (totalTonerAmount > -1 && totalTonerAmount <= 100) ? totalTonerAmount : -1;
        if ((tonerAmount > 0 && tonerAmount <= 100) && (totalTonerAmount != -1) ) {
            this.tonerLevel = totalTonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int duplexPagesToPrint = (pages / 2) + (pages % 2);
        int pagesToPrint = this.duplex ? duplexPagesToPrint : pages;
        this.pagesPrinted += pagesToPrint;

        return pagesToPrint;
    }

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }
}
