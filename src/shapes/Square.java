package shapes;

import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Square extends Quadrilateral {

    //    public Square(int side) {
//        super(side, side);
//    }
//    @Override
//    public double getPerimeter() {
//        return 4 * length;
//    }
//    @Override
//    public double getArea() {
//        return Math.pow(length,2);
//    }
    public Square(double length) {
        super(length, length);
    }

    @Override
    void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    void setWidth(double width) {
        this.length = width;
        this.width = width;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }


}
