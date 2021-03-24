package geometry;

import exception.AppException;

public abstract class Shape implements Comparable<Shape>, Movable {

    public enum ShapeEnum {RECTANGLE, SQUARE, CIRCLE}

    private String color;

    private boolean filled;

    private Point point;

    public Shape(String color, boolean filled, Point point) {
        this.color = color;
        this.filled = filled;
        this.point = point;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    @Override
    public void moveTo(double x, double y) {
        this.point.setX(x);
        this.point.setY(y);
    }

    @Override
    public void translate(double dx, double dy) {
        this.point.setX(this.point.getX() + dx);
        this.point.setY(this.point.getY() + dy);
    }

    @Override
    public void divide(int factor) throws AppException {
        try {
            double newX = this.point.getX() / factor;
            this.point.setX(newX);
            this.point.setY(this.point.getY() / factor);
        } catch (ArithmeticException e) {
            throw new AppException("Dividing by 0");
        }
    }

    @Override
    public int compareTo(Shape o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    @Override
    public String toString() {
        return "Shape{" + "color='" + color + '\'' + ", filled=" + filled + '}';
    }

}
