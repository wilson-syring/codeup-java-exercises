package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Input myInput = new Input(new Scanner(System.in));
        boolean circleAgain = true;
        System.out.println("Would you like to play the circle game?");
        circleAgain = myInput.yesNo();
        while (circleAgain) {
            System.out.print("Please enter a radius:");
            var radius = myInput.getDouble();
            Circle myCircle = new Circle(radius);
            System.out.printf("Area = %.2f\n", myCircle.getArea());
            System.out.printf("Circumference = %.2f\n", myCircle.getCircumference());
            System.out.println("want to go around again?");
            circleAgain = myInput.yesNo();
        }
    }
}
