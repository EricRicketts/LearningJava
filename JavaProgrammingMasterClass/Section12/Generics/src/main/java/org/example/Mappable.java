package org.example;

import java.util.List;

public interface Mappable {
    String render();

    static double[] stringToLatLong(String location) {
        var splits = location.split(",");
        double latitude = Double.valueOf(splits[0]);
        double longitude = Double.valueOf(splits[1]);
        return new double[]{latitude, longitude};
    }
}
