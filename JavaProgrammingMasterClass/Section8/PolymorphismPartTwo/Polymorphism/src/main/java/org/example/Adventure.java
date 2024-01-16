package org.example;

public class Adventure extends Movie {

    @Override
    public String watchMovie() {
        String s1 = super.watchMovie();
        String s2 = String.format("... %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens."
        );
        return String.join(" ", s1, s2);
    }

    public Adventure(String title) {
        super(title);
    }
}
