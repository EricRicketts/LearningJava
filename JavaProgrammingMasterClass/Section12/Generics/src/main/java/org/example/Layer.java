package org.example;

import java.util.ArrayList;
import java.util.List;
/*
    It is important to understand the purpose of the Layer class.  The class definition has the Generic upperbound
    "T extends Mappable", this means Layer can be of type Mappable or any of its implementations => Point, Line
    or any of the subclasses of those implementations: Point => Park, Line => River

    This gives the developer the flexibility to pass in a Park or a River.  This also assumes each object
    has implemented Mappable's render() method.
*/
public class Layer <T extends Mappable> {

    private final List<T> layerElements;

    public Layer(T[] layerElements) {
        this.layerElements = new ArrayList<>(List.of(layerElements));
    }

    @SafeVarargs
    public final void addElements(T... elements) {
        this.layerElements.addAll(List.of(elements));
    }

    public String renderLayer() {
        StringBuilder renderOutput = new StringBuilder();
        for (T element : this.layerElements) {
            renderOutput.append(element.render()).append("\n");
        }
        return renderOutput.toString();
    }
}
