public abstract class TwoDShape { // abstract class cannot instantiate an object
    private double height;
    private double width;
    private String name;

    TwoDShape() {
        height = width = 0.0;
        name = "none";
    }

    TwoDShape(String n, double x) {
        height = width = x;
        name = n;
    }

    TwoDShape(TwoDShape ob) {
        height = ob.height;
        width = ob.width;
        name = ob.name;
    }

    TwoDShape(String n, double h, double w) {
        height = h;
        width = w;
        name = n;
    }

    double getHeight() { return height; }
    double getWidth() { return width; }
    String getName() { return name; }
    void setHeight(double h) { height = h; }
    void setWidth(double w) { width = w; }
    void setName(String n) { name = n; }

    String showDimensions() {
        return "height is: " + height + " width is: " + width;
    }

    abstract double area(); // a subclass must define an area() method unless the subclass itself is abstract
}
