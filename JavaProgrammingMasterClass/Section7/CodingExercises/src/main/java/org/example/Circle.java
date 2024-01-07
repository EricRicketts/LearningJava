package org.example;

public class Circle {

    private double radius;

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getRadius() {
        return this.radius;
    }

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius < 0 ? 0 : radius;
    }
}
