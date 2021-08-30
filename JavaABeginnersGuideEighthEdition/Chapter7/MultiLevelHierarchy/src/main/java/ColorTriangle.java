public class ColorTriangle extends Triangle {
    private String color;

    ColorTriangle(String c, String s, double h, double w) {
        super(s, h, w);
        color = c;
    }

    String getColor() { return color; }
    void setColor(String c) { color = c; }
    String showColor() {
        return "Color is " + color;
    }
}
