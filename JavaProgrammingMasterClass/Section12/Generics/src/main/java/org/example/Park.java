package org.example;

public class Park extends Point {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Park{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }

    public Park(String name, String location) {
        super(location);
        this.name = name;
    }
}
