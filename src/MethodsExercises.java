import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MethodsExercises {

    public static void add(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + "= " + (num1 + num2));
    }

    public static void subtract(int num1, int num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void multiply(int num1, int num2) {
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public static void divide(int num1, int num2) {
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }

    public static void modulus(int num1, int num2) {
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    }


    public static void getInteger(int min, int max) {
        while (true) {
            System.out.println("Enter a number between " + min + " and " + max + ":");
            Scanner scan = new Scanner(System.in);
            String response = scan.nextLine();
            int number = Integer.parseInt(response);

            if (number > min && number < max) {
                System.out.println(number + " is in the target range");
            } else {
                System.out.println(number + " is out of target range");
            }
            break;
        }
    }

    public static void factorialFinder() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10:");
        String input = scan.nextLine();
        int numb = Integer.parseInt(input);
        long factorial = 1;
        for (int x = 1; x <= numb; x++) {
            factorial = factorial * x;
        }
        System.out.println(numb + "! = " + factorial);
    }

    public static void dicey() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose number of sides for the dice roll");
        String resp = scan.nextLine();
        int side = Integer.parseInt(resp);
        int dice1 = ThreadLocalRandom.current().nextInt(1, side + 1);
        int dice2 = ThreadLocalRandom.current().nextInt(1, side + 1);
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);
    }
    public static void main(String[] args) {
        add(5, 17);
        subtract(36, 15);
        multiply(10, 20);
        divide(100, 5);
        modulus(100, 1000);
        getInteger(1, 100);
        factorialFinder();
        dicey();
    }
}
