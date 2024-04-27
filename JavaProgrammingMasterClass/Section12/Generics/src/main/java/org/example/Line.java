package org.example;

import java.util.List;

public class Line {

    List<Point> points;

    public List<Point> render() {
        return points;
    }

    public Point renderPoint(int index) {
        return points.get(index);
    }

    public Line(List<Point> points) {
        this.points = points;
    }
}
