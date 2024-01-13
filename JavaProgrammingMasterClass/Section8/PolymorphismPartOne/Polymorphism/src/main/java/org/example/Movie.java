package org.example;

public class Movie {

    private final String title;

    public String getTitle() {
        return title;
    }

    public String watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        return this.getTitle() + " is a " + instanceType + " film.";
    }

    public Movie(String title) {
        this.title = title;
    }
}
