package geometry;

public class Square extends Rectangle {

    public Square(double length, String color, boolean filled) {
        super(length, length, color, filled);
    }

    @Override
    public void setLength(double length) {
        // Ici en passant par les setters de la classe rectangle (qui sont public)
        // cela nous permet de mettre les attributs de la classe rectangle en private
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public String toString() {
        return "Square{" + super.toString() + '}';
    }

}
