package bookpackext;

public class ExtBook extends bookpack.Book {
    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

   public String show() {
        return super.show() + ", Publisher: " + publisher;
   }

   /*
    An important point about protected elements within a class.  ExtBook is a subclass of Book, so it has
    access to the protected members in Book, this is why ExtBook was able to define the getter and setter
    methods below.
   */
   public String getAuthor() { return author; }
   public int getPubDate() { return pubDate; }
   public String getTitle() { return title; }
   public void setAuthor(String a) { author = a; }
   public void setPubDate(int d) { pubDate = d; }
   public void setTitle(String t) { title = t; }

   public String getPublisher() { return publisher; }
   public void setPublisher(String p) { publisher = p; }
}

class ProtectDemo {
    public static String getSchildt() {
        StringBuilder booksBySchildt = new StringBuilder("");
        ExtBook books[] = new ExtBook[5];
        books[0] =  new ExtBook("Java: A Beginner's Guide", "Schildt", 2019, "Oracle Press");
        books[1] =  new ExtBook("Java: The Complete Reference", "Schildt", 2019, "Oracle Press");
        books[2] =  new ExtBook("Introducing JavaFX 8 Programming", "Schildt", 2015, "Oracle Press");
        books[3] =  new ExtBook("Red Storm Rising", "Clancy", 1986, "Putnam");
        books[4] =  new ExtBook("On The Road", "Kerouac", 1955, "Viking");

        for (int i = 0; i < books.length; i += 1) {
            if (books[i].getAuthor().equals("Schildt")) booksBySchildt.append(" ").append(books[i].getTitle());
        }
        return booksBySchildt.toString().stripLeading();
    }
}
/*
    Again, another point about protected members, the class ProtectDemo is not a subclass of Book therefore
    it does not have access to the protected members of Book.  Because ExtBook is part of the same package,
    class ProtectDemo can create instances of ExtBook and call the methods.  However, I would get a compile error
    if I tried books[i].title as here I am trying to access the protected member directly.  ProtectDemo cannot do
    this because it is not a subclass of Book.
*/
