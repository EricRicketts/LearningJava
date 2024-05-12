package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Point implements Mappable {

    Double latitude;
    Double longitude;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public List<Double> render() {
        return new ArrayList<>(Arrays.asList(getLatitude(), getLongitude()));
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Point(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
