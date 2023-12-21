package org.example;

public record Carpet(double cost) {

    public Carpet(double cost) {
        this.cost = cost < 0 ? 0 : cost;
    }
}
