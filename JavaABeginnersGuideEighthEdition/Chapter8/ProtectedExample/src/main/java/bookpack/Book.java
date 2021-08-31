package bookpack;

public class Book {
    protected String title;
    protected String author;
    protected int pubDate;

    public Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    public String show() {
        return "Book Title: " + title + ", Book Author: " + author + ", Publication Date: " + pubDate;
    }
}
