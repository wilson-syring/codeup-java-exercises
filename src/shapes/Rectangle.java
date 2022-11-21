package shapes;

import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Quadrilateral implements Measurable{
//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        this.width = width;
//        this.length = length;
//    }
//
//    public double getArea(){
//        return this.length * this.width;
//    }
//    public double getPerimeter(){
//        return (this.length * 2) + (this.width * 2);
//    }
public Rectangle(double length, double width) {
    super(length, width);
}
    @Override
    void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (this.width * 2) + (this.length * 2);
    }

    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    void setLength(double length) {
        this.length = length;
    }




















}
