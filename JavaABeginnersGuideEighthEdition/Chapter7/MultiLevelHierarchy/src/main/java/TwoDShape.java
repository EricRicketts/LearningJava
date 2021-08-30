public class TwoDShape {
    private double height;
    private double width;

    TwoDShape() {
        height = width = 0;
    }

    TwoDShape(double x) {
        height = width = x;
    }

    TwoDShape(double h, double w) {
        height = h;
        width = w;
    }

    double getHeight() { return height; }
    double getWidth() { return width; }
    void setHeight(double h) { height = h; }
    void setWidth(double w) { width = w; }

    String showDimensions() {
        return "height: " + getHeight() + " width: " + getWidth();
    }
}
