package org.example;

public class Printer {

    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    private boolean checkTonerAmount(int tonerAmount) {
        return tonerAmount > 0 && tonerAmount <= 100;
    }

    private int checkTonerLevel(int tonerLevel) {
        return (tonerLevel > -1 && tonerLevel <= 100) ? tonerLevel : -1;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        if (checkTonerAmount(tonerAmount) && checkTonerLevel(this.tonerLevel + tonerAmount) != -1) {
            this.tonerLevel += tonerAmount;
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
        this.tonerLevel = checkTonerLevel(tonerLevel);
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }
}
