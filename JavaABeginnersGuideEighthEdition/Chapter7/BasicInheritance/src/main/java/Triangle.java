public class Triangle extends TwoDShape {
    private String style;

    Triangle(String s, double l, double w) {
        setLength(l);
        setWidth(w);
        style = s;
    }

    double area() {
        return getLength() * getWidth() / 2;
    }

    String getStyle() {
        return style;
    }

    void setStyle(String s) {
        style = s;
    }
}
