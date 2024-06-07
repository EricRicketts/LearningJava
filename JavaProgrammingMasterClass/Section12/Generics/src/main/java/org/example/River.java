package org.example;

public class River extends Line {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "River{" +
                "name='" + name + '\'' +
                "}";
    }

    public River(String name, String... locations) {
        super(locations);
        this.name = name;
    }
}
