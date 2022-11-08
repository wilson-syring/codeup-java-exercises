import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.141592;
        System.out.format("The value of pi is approximately %.2f %n", pi);

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        int userInt = myScanner.nextInt();
        System.out.println("you entered "+ userInt);

        System.out.println("Please enter 3 words:");
        String userInput1 = myScanner.next();
        String userInput2 = myScanner.next();
        String userInput3 = myScanner.next();
        System.out.println("you entered these three words "+ userInput1 +" "+ userInput2 +" "+userInput3);
        myScanner.nextLine();

        System.out.println("Please enter a sentence:");
//		String sentence = myScanner.next();
        String sentence = myScanner.nextLine();
        System.out.print("This is a lovely sentence: " + sentence);
        myScanner.nextLine();

        System.out.println("Please enter the length of the room:");
        String length = myScanner.nextLine();
        System.out.println("Please enter the width of the room:");
        String width = myScanner.nextLine();
        int area = Integer.parseInt(length) * Integer.parseInt(width);
        int perimeter = 2 * (Integer.parseInt(length) + Integer.parseInt(width));
        System.out.printf("Area: " + area + "\nPerimeter: " + perimeter);


    }

}
