package bookpack;

public class Book {
    String author;
    String title;
    int pubDate;

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
        return "Title: " + title + ", Author: " + author + ", Publication Date: " + pubDate;
    }
}
