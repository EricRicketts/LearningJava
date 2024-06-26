package org.example;

import java.util.ArrayList;
import java.util.List;

public class Layer <T extends Mappable> {

    private List<T> layerElements;

    public Layer(T[] layerElements) {
        this.layerElements = new ArrayList<>(List.of(layerElements));
    }

    public void addElements(T... elements) {
        this.layerElements.addAll(List.of(elements));
    }

    public String renderLayer() {
        String renderOutput = "";
        for (T element : this.layerElements) {
            renderOutput += element.render() + "\n";
        }
        return renderOutput;
    }
}
