import exception.AppException;
import geometry.Circle;
import geometry.Rectangle;
import geometry.Shape;
import geometry.Square;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) throws AppException {
        System.out.println("Quelle forme voulez vous créer ?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Shape.ShapeEnum shapeEnum = Shape.ShapeEnum.valueOf(input);

        Shape shape = null;

        switch (shapeEnum) {
            case RECTANGLE:
                System.out.println("Largeur ?");
                double width = scanner.nextDouble();
                if (width < 0) {
                    throw new AppException("Value is < 0");
                }
                System.out.println("Longueur ?");
                double length = scanner.nextDouble();
                if (length < 0) {
                    throw new AppException("Value is < 0");
                }
                shape = new Rectangle(length, width, "red", true);
                break;
            case SQUARE:
                System.out.println("Longueur ?");
                length = scanner.nextDouble();
                shape = new Square(length, "red", true);
                break;
            case CIRCLE:
                System.out.println("Radius ?");
                double radius = scanner.nextDouble();
                shape = new Circle(radius, "red", true);
                break;
        }

        System.out.println(shape);
    }

}
