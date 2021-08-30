package bookpack;

public class Book {
    private String title;
    private String author;
    private int pubDate;

    public Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    public String getAuthor() { return author; }
    public int getPubDate() { return pubDate; }
    public String getTitle() { return title; }

    public void setAuthor(String a) { author = a; }
    public void setPubDate(int d) { pubDate = d; }
    public void setTitle(String t) { title = t; }

    public String show() {
        return "title: " + title + " author: " + author + " publication date: " + pubDate;
    }
}
