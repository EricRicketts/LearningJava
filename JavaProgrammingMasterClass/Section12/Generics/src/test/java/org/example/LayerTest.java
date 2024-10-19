package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LayerTest {

    String expected, results;
    Park[] nationalUSParks;
    River[] majorUSRivers;
    Object[] parksAndRivers;
    /*
        Note only Park and River can be instantiated as Point and Line are abstract classes and cannot be instantiated.
        Park and River have render() methods, so the renderLayer() method ends up calling an objects render() method.
    */

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
        parksAndRivers = new Object[]{
                new Park[]{
                        new Park("Yellowstone", "44.4882, -110.5916"),
                        new Park("Grand Canyon", "36.1085, -112.0965"),
                },
                new River[]{
                        new River("Mississippi",
                                "47.2160, -95.2348", "29.1566, -89.2495", "35.1556, -90.0659"
                        ),
                        new River("Missouri",
                                "45.9239, -111.4983", "38.8146, -90.1218"
                        )
                }
        };
    }

    @Test
    public void testParkLayer() {
        expected = """
                Render Park{name='Yellowstone'} as POINT ([44.4882, -110.5916])
                Render Park{name='Grand Canyon'} as POINT ([36.1085, -112.0965])
                Render Park{name='Yosemite'} as POINT ([37.8855, -119.536])
                Render Park{name='Zion'} as POINT ([37.27, 112.19])
                Render Park{name='Great Smokey Mountains National Park'} as POINT ([35.63, 83.45])
                """;
        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        Park[] parksToAdd = new Park[]{
                new Park("Zion", "37.27, 112.19"),
                new Park("Great Smokey Mountains National Park", "35.63, 83.45")
        };
        parkLayer.addElements(parksToAdd);
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

    @Test
    public void testAddParksAndRiversParkLayer() {
        expected = """
                Render Park{name='Yellowstone'} as POINT ([44.4882, -110.5916])
                Render Park{name='Grand Canyon'} as POINT ([36.1085, -112.0965])
                """;
        Layer<Park> parkLayer = new Layer<>((Park[]) parksAndRivers[0]);
        results = parkLayer.renderLayer();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testAddParksAndRiversRiverLayer() {
        expected = """
                Render River{name='Mississippi'} as LINE ([[47.216, -95.2348], [29.1566, -89.2495], [35.1556, -90.0659]])
                Render River{name='Missouri'} as LINE ([[45.9239, -111.4983], [38.8146, -90.1218]])
                """;
        Layer<River> riverLayer = new Layer<>((River[]) parksAndRivers[1]);
        results = riverLayer.renderLayer();
        Assertions.assertEquals(expected, results);
    }
}
/*
    The last two tests "testAddParksAndRiversParkLayer" and "testAddParksAndRiversRiverLayer" were tests where I explored what
    I would have to do to mix different layers.  Though one can mix Rivers and Parks in an Object[], one cannot mix River
    and Park Layers.  Note in each of the above tests I had to pick out the Parks and Rivers objects separately in order to
    create a Park or River Layer.  The code does not allow me to create a Mappable Layer, which would allow either a Park or
    River Layer, as ultimately the Park or River classes are subclassed to Mappable.  Since Mappable is an Interface it
    cannot be instantiated.

    The code above proves the intent of the designer, as a Layer (or Mappable Layer to be more specific) should only be of
    one type.  If a cartographer is making a map and using layers to overlay a map, he wants a given layer to be of one type.
    It would make no sense to mix Parks and Rivers on one Layer.  My guess the technique for overlaying a river is different
    from overlaying a park.

    Note in the two tests above you see this specificity of Layers when instantiating a given layer => Layer<River> or
    Layer<Park>.  In order to have a mix of Parks and Rivers, Mappable would have to be a class then I could instantiate
    an array of Mappable objects which could be Parks and Rivers.  Doing so really defeats the purpose of making Mappable,
    Point, and Line abstract.  If we are dealing with cartography we are not going to put a point on a map but a point which
    represents an item of interest, like a Park.  Likewise, we are not going to put a line on a map but a series of lines
    which make up a River.  We are just defining Mappable, Point, and Line to give Park and River the fields and behavior
    they need.

*/
