package org.example;

import java.util.List;

public class Line {

    List<List<Point>> points;

    public List<List<Point>> render() {
        return points;
    }

    public List<Point> renderPoint(int index) {
        return points.get(index);
    }

    public Line(List<List<Point>> points) {
        this.points = points;
    }
}
