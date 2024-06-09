package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LayerTest {

    String expected, results;
    Park[] nationalUSParks;
    River[] majorUSRivers;

    @BeforeEach
    public void setUp() {
        nationalUSParks = new Park[]{
                new Park("Yellowstone", "44.4882, -110.5916"),
                new Park("Grand Canyon", "36.1085, -112.0965"),
                new Park("Yosemite", "37.8855, -119.5360")
        };
        majorUSRivers = new River[]{
                new River("Mississippi",
                        "47.2160, -95.2348", "29.1566, -89.2495", "35.1556, -90.0659"
                ),
                new River("Missouri",
                        "45.9239, -111.4983", "38.8146, -90.1218"
                )
        };
    }

    @Test
    public void testParkLayer() {
        expected = """
                Render Park{name='Yellowstone'} as POINT ([44.4882, -110.5916])
                Render Park{name='Grand Canyon'} as POINT ([36.1085, -112.0965])
                Render Park{name='Yosemite'} as POINT ([37.8855, -119.536])
                """;
        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        results = parkLayer.renderLayer();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testRiverLayer() {
        expected = """
                Render River{name='Mississippi'} as LINE ([[47.216, -95.2348], [29.1566, -89.2495], [35.1556, -90.0659]])
                Render River{name='Missouri'} as LINE ([[45.9239, -111.4983], [38.8146, -90.1218]])
                Render River{name='Colorado'} as LINE ([[40.4708, -105.8286], [31.7811, -114.7724]])
                Render River{name='Delaware'} as LINE ([[42.2026, -75.00836], [39.4955, -75.5592]])
                """;
        Layer<River> riverLayer = new Layer<>(majorUSRivers);
        riverLayer.addElements(
                new River("Colorado",
                        "40.4708, -105.8286", "31.7811, -114.7724"
                ),
                new River("Delaware",
                        "42.2026, -75.00836", "39.4955, -75.5592"
                )
        );
        results = riverLayer.renderLayer();
        Assertions.assertEquals(expected, results);
    }
}
