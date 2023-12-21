package org.example;

public class Point {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double differenceOfSquares = Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2);
        return Math.sqrt(differenceOfSquares);
    }

    public double distance(Point p1) {
        double differenceOfSquares =
                Math.pow((p1.getX() - this.getX()), 2) + Math.pow((p1.getY() - this.getY()), 2);
        return Math.sqrt(differenceOfSquares);
    }

    public double distance(int x, int y) {
        double differenceOfSquares =
                Math.pow((this.getX() - x), 2) + Math.pow((this.getY() - y), 2);
        return Math.sqrt(differenceOfSquares);
    }

    public Point() {}
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
