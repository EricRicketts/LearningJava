package org.example;

public record Floor(double width, double length) {

    public double getArea() {
        return this.width * this.length;
    }

    public Floor(double width, double length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }
}


