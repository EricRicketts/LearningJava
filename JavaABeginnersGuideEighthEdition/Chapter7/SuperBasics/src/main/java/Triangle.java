public class Triangle extends TwoDShape {
    private String style;
    int i;

    Triangle() {
        super();
        super.i = 0; // use this to initialize super class instance variable with the same name as the subclass
        i = 1;
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
