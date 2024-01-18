package org.example;

public class Movie {

    private final String title;

    public static Movie getMovie(String type, String title) {
        return switch(type) {
            case "Adventure" -> new Adventure(title);
            case "Comedy" -> new Comedy(title);
            case "ScienceFiction" -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }

    public String getTitle() {
        return title;
    }

    public String watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        return this.getTitle() + " is a " + instanceType + " film.\n";
    }

    public Movie(String title) {
        this.title = title;
    }
}
