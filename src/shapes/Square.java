package shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }
    @Override
    public double getPerimeter() {
        return 4 * length;
    }
    @Override
    public double getArea() {
        return Math.pow(length,2);
    }
}
