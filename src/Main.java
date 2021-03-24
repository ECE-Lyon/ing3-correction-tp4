import exception.AppException;
import geometry.Circle;
import geometry.Rectangle;
import geometry.Shape;
import geometry.Square;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws AppException {
        Random random = new Random(42);

        Shape[] shapes = new Shape[6];

        shapes[0] = new Rectangle(random.nextDouble(), random.nextDouble(), "red", true);
        shapes[1] = new Rectangle(random.nextDouble(), random.nextDouble(), "red", true);
        shapes[2] = new Square(random.nextDouble(), "red", true);
        shapes[3] = new Square(random.nextDouble(), "red", true);
        shapes[4] = new Circle(random.nextDouble(), "red", true);
        shapes[5] = new Circle(random.nextDouble(), "red", true);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        Arrays.sort(shapes);

        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }

        System.out.println(Arrays.toString(shapes));

        shapes[0].divide(0);
    }

}
