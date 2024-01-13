package org.example;

public class Printer {

    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int addToner(int tonerAmount) {
        this.tonerLevel += tonerAmount;
        this.tonerLevel =  this.tonerLevel < 0 ? -1 : Math.min(100, this.tonerLevel);
        return this.tonerLevel;
    }

    public int printPages(int pages) {
        int pagesForDuplex = (pages % 2 == 0) ? (pages / 2) : (pages / 2) + 1;
        int pagesForThisPrintJob = this.isDuplex() ? pagesForDuplex : pages;
        this.pagesPrinted += pagesForThisPrintJob;

        if (this.isDuplex()) System.out.println("Duplex printer.");
        return pagesForThisPrintJob;
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }
}
