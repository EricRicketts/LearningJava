package org.example;

public class ScienceFiction extends Movie {

    @Override
    public String watchMovie() {
        String s1 = super.watchMovie();
        String s2 = String.format("... %s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys Chase Aliens",
                "Planet Blows Up."
        );
        return String.join("", s1, s2);
    }

    public String watchScienceFiction() {
        return "Watching a Science Fiction movie.";
    }

    public ScienceFiction(String title) {
        super(title);
    }
}
