package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BuildingTest {

    private List<Building> buildings;
    private Building building;
    String expected, results;

    @BeforeEach
    public void setUp() {
        buildings = new ArrayList<>();
        buildings.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        buildings.add(new Building("Sydney Opera House", UsageType.ENTERTAINMENT));
        buildings.add(new Building("Stadium Australia", UsageType.SPORTS));
    }

    @Test
    public void testGetMarker() {
        expected = "RED STAR";
        results = buildings.get(0).getMarker();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testGetLabel() {
        expected = "Sydney Opera House (ENTERTAINMENT)";
        results = buildings.get(1).getLabel();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testGetShape() {
        expected = "POINT";
        results = String.valueOf(buildings.get(2).getShape());
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testMapIt() {
        expected = """
                    "properties" : {"type" : "POINT", "label" : "Sydney Town Hall (GOVERNMENT)", "marker" : "RED STAR"
                }
                """;
        results = Mappable.mapIt(buildings.get(0));
        Assertions.assertEquals(expected, results);
    }
}
