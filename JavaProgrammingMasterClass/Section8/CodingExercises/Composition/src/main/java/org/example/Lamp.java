package org.example;

public class Lamp {

    private String style;
    private boolean battery;
    private int globRating;

    public void turnOn() {
        System.out.println("The lamp is being turned on.");
    }

    public String getStyle() {
        return this.style;
    }

    public boolean isBattery() {
        return this.battery;
    }

    public int getGlobRating() {
        return this.globRating;
    }

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating; // rating in Lumens
    }
}
