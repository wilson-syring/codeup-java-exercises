package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public double getArea(){
        return this.length * this.width;
    }
    public double getPerimeter(){
        return this.length * 2 + this.width * 2;
    }

}
