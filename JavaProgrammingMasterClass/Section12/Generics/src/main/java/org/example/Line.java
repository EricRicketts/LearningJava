package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Line {

    List<Point> points = new ArrayList<>();

    public List<Point> render() {
        return points;
    }

    public Point renderPoint(int index) {
        return points.get(index);
    }

    public Line(Double[][] inputCoords) {
        for (Double[] coords : inputCoords) {
            Double latitude = coords[0];
            Double longitude = coords[1];
            points.add(new Point(latitude, longitude));
        }
    }
}
