public class Triangle extends TwoDShape {
    private String style;

    Triangle() {
        super();
        style = "none";
    }

    Triangle(String s, double x) {
        super(x);
        style = s;
    }

    Triangle(String s, double l, double w) {
        super(l, w);
        style = s;
    }

    double area() {
        return getLength() * getWidth() / 2;
    }

    String showStyle() {
        return "Triangle is of style or type " + style;
    }
}
