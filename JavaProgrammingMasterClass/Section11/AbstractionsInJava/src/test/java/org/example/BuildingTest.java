package org.example;

import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public class BuildingTest {

    private List<Mappable> buildings;
    String[] expected, results;

    @BeforeEach
    public void setUp() {
        buildings = new ArrayList<>();
        buildings.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        buildings.add(new Building("Sydney Opera House", UsageType.ENTERTAINMENT));
        buildings.add(new Building("Stadium Australia", UsageType.SPORTS));
    }
}
