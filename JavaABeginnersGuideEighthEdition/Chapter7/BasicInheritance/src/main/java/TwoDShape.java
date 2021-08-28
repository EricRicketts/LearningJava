public class TwoDShape {
    private double length;
    private double width;

    double getLength() { return length; }
    double getWidth() { return width; }
    void setLength(double newLength) { length = newLength; }
    void setWidth(double newWidth) { width = newWidth; }

    String showDimensions() {
        return new String("Length is " + length + " Width is " + width);
    }
}
