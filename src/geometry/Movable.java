package geometry;

import exception.AppException;

public interface Movable {

    void moveTo(double x, double y);

    void translate(double dx, double dy);

    void divide(int factor) throws AppException;

}
