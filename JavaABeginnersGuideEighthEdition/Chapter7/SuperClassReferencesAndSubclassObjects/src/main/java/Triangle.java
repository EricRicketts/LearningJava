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

    Triangle(Triangle ob) {
        super(ob); // pass Triangle object to TwoDShape constructor will call TwoDShape(TwoDShape ob) and will
        // only initialize height and width
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    String getStyle() { return style; }
    void setStyle(String s) { style = s; }
    String showStyle() {
        return "Style is " + style;
    }

}
