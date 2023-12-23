package org.example;

public class Fish extends Animal {

    private int fins;
    private int gills;

    public int getFins() {
        return fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }

    public int getGills() {
        return gills;
    }

    public void setGills(int gills) {
        this.gills = gills;
    }

    private String moveMuscles() {
        return "Muscles moving";
    }
    public String moveBackFins() {
        return "Back fins moving";
    }

    @Override
    public String move(String speed) {
        String movement = super.move(speed) + "  " + moveMuscles();
        if (speed.equals("fast")) {
            movement += (".  " + moveBackFins() + ".");
        } else {
            movement += ".";
        }
        return movement;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }

    public Fish(String type, double weight, int fins, int gills) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }
}
