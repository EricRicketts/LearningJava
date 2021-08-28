public class TwoDShape {
    private double length;
    private double width;

    TwoDShape() {
        length = width = 0;
    }

    TwoDShape(double x) {
        length = width = x;
    }

    TwoDShape(double l, double w) {
        length = l;
        width = w;
    }

    double getLength() { return length; }
    double getWidth() { return width; }
    void setLength(double l) { length = l; }
    void setWidth(double w) { width = w; }

    String showDimensions() {
        return "length: " + length + " width: " + width;
    }
}
