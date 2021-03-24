package geometry;

public class Rectangle extends Shape {

    private double length;

    private double width;

    public Rectangle(double length, double width, String color, boolean filled) {
        this(length, width, color, filled, new Point(0, 0));
    }

    public Rectangle(double length, double width, String color, boolean filled, Point point) {
        super(color, filled, point);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + super.toString() + ", length=" + length + ", width=" + width + '}';
    }

}
