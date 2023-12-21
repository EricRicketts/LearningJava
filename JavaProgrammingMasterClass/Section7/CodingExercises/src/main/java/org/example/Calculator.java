package org.example;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public double getTotalCost() {
        return floor.getArea() * carpet.cost();
    }

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
}
