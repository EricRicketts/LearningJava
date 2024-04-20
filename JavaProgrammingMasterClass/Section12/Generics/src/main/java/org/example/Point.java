package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Point implements Mappable {

    Double xCoord;
    Double yCoord;

    public Double getxCoord() {
        return xCoord;
    }

    public void setxCoord(Double xCoord) {
        this.xCoord = xCoord;
    }

    public Double getyCoord() {
        return yCoord;
    }

    public List<Double> render() {
        return new ArrayList<>(Arrays.asList(getxCoord(), getyCoord()));
    }

    public void setyCoord(Double yCoord) {
        this.yCoord = yCoord;
    }

    public Point(Double xCoord, Double yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }
}
