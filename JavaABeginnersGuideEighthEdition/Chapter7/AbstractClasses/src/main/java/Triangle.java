public class Triangle extends TwoDShape {
    private String style;

    Triangle() {
        super();
        style = "none";
    }

    Triangle(double x) {
       super("Triangle", x);
       style = "filled";
    }

    Triangle(Triangle ob) {
       super(ob);
       style = ob.style;
    }

    Triangle(String s, double h, double w) {
        super("Triangle", h, w);
        style = s;
    }

    String getStyle() { return style; }
    void setStyle(String s) { style = s; }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    String showStyle() {
        return "Style is: " + style;
    }
}
