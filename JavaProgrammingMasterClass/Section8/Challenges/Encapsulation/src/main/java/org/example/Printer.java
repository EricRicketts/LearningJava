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

    private int checkTonerLevel(int tonerLevel) {
        return tonerLevel < 0 ? -1 : Math.min(100, tonerLevel);
    }

    public int addToner(int tonerAmount) {
        this.tonerLevel += tonerAmount;
        this.tonerLevel =  checkTonerLevel(this.tonerLevel);
        return this.tonerLevel;
    }

    public int printPages(int pages) {
        // I used a ternary before seeing the instructor solution below is a
        // better way to calculate duplex printer pages, in one statement
        // it factors in even or odd number of pages
        int pagesForDuplex = (pages / 2) + (pages % 2);
        int pagesForThisPrintJob = this.isDuplex() ? pagesForDuplex : pages;
        this.pagesPrinted += pagesForThisPrintJob;

        if (this.isDuplex()) System.out.println("Duplex printer.");
        return pagesForThisPrintJob;
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = checkTonerLevel(tonerLevel);
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }
}
