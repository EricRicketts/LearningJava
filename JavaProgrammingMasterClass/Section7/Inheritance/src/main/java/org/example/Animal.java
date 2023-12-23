package org.example;

public class Animal {

    private String type;
    private String size;
    private double weight;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String makeNoise() {
        return type + " makes some kind of noise.";
    }

    public String move(String speed) {
        return type + " moves " + speed + ".";
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Animal() {}

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
}
