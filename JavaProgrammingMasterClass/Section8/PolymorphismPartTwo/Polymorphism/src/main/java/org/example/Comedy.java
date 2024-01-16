package org.example;

public class Comedy extends Movie {

    @Override
    public String watchMovie() {
        String s1 = super.watchMovie();
        String s2 = String.format("... %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy ending."
        );
        return String.join("", s1, s2);
    }

    public Comedy(String title) {
        super(title);
    }
}
