package org.example;

public class Car {

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertable;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertable() {
        return convertable;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertable(boolean convertable) {
        this.convertable = convertable;
    }

    public String describeCar() {
        return doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertable ? "Convertable" : "");
    }
}
