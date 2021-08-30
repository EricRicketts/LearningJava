public class Rectangle extends TwoDShape {
    Rectangle() {
        super();
    }

    Rectangle(double x) {
        super("Rectangle", x);
    }

    Rectangle(Rectangle ob) {
        super(ob);
    }

    Rectangle(double h, double w) {
        super("Rectangle", h, w);

    }

    boolean isSquare() {
        return getHeight() == getWidth();
    }
    double area() {
        return getHeight() * getWidth();
    }
}
