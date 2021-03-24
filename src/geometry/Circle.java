package geometry;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius, String color, boolean filled, Point point) {
        super(color, filled, point);
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled, new Point(0, 0));
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString() + ", radius=" + radius + '}';
    }

}
