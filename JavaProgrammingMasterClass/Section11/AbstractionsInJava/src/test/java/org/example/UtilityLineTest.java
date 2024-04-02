package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class UtilityLineTest {

    private List<UtilityLine> utilityLineList;
    private UtilityLine utilityLine;
    String expected, results;

    @BeforeEach
    public void setUp() {
        utilityLineList = new ArrayList<>();
        utilityLineList.add(new UtilityLine("College Street", UtilityType.FIBER_OPTIC));
        utilityLineList.add(new UtilityLine("Olympic Blvd", UtilityType.WATER));
    }

    @Test
    public void testLabel() {
        expected = "College Street (FIBER_OPTIC)";
        results = utilityLineList.get(0).getLabel();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testGetShape() {
        expected = "LINE";
        results = String.valueOf(utilityLineList.get(1).getShape());
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testGetMarker() {
        expected = "GREEN DOTTED";
        results = utilityLineList.get(0).getMarker();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testMapIt() {
        expected = """
                    "properties" : {"type" : "LINE", "label" : "Olympic Blvd (WATER)", "marker" : "BLUE SOLID"
                }
                """;
        results = Mappable.mapIt(utilityLineList.get(1));
        Assertions.assertEquals(expected, results);
    }
}
