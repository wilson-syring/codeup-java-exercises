package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Input myInput = new Input(new Scanner(System.in));
        System.out.print("Please enter a radius:");
        var radius = myInput.getDouble();
        Circle myCircle = new Circle(radius);
        System.out.printf("Area = %.2f\n" , myCircle.getArea());
        System.out.printf("Circumference = %.2f" , myCircle.getCircumference());
    }
}
