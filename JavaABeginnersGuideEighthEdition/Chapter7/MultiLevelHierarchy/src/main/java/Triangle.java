public class Triangle extends TwoDShape {
    private String style;

    Triangle() {
        super();
        style = "none";
    }

    Triangle(double x) {
        super(x);
        style = "filled";
    }

    Triangle(String s, double h, double w) {
        super(h, w);
        style = s;
    }

    String getStyle() { return style; }
    void setStyle(String s) { style = s; }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    String showStyle() {
        return "Triangle is " + style;
    }
}
