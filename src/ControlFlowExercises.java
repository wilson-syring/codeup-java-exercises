import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//        System.out.println();

//        int i = 0;
//        do{
//            System.out.println(i);
//			i += 2;
//        }while(i <= 100);

//        int i = 100;
//        do{
//            System.out.println(i);
//			i -= 5;
//        }while(i >= -10);

//        int i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//            if (i == 0) {
//                break;
//            }
//
//        } while (i <= 1000000);
//
//        for(int i = 0; i <= 100; i+=2){
//			System.out.println(i);
//		}
//
//        for(int i = 100; i >= -10; i-=5){
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 30; i++) {
//			if (i % 15 == 0) {
//				System.out.println("FizzBuzz");
//			} else if (i % 3 == 0) {
//				System.out.println("Fizz");
//			} else	if (i % 5 == 0) {
//				System.out.println("Buzz");
//			} else {
//				System.out.println(i);
//			}
//		}

        Scanner uScan = new Scanner(System.in);
//        System.out.println("What number would you like to use for the table?");
//        int userInt = uScan.nextInt();
//        System.out.println();
//        System.out.println("number | square | cube");
//
//        for (int i = 1; i <= userInt; i++){
//            int square = i * i;
//            int cube = square * i;
//            System.out.printf("%6d | %7d | %5d%n", i, square, cube);
//        }
//        System.out.println();
//

        while (true) {
            System.out.println("Enter a grade from 0 to 100.");
            int grade = uScan.nextInt();
            if (grade <= 100 && grade >= 90) {
                System.out.println("You made an: A");
            } else if (grade <= 89 && grade >= 80) {
                System.out.println("You made a: B");
            } else if (grade <= 79 && grade >= 70) {
                System.out.println("You made a: C");
            } else if (grade <= 69 && grade >= 0) {
                System.out.println("You failed, study harder");
            } else {
                System.out.println("This is not a valid grade.");
            }
            System.out.println();

            System.out.println("Would you like to check another grade? Please input yes or no");
            String uContinue = uScan.nextLine().trim();

            while (!uContinue.equalsIgnoreCase("yes") && !uContinue.equalsIgnoreCase("no")) {
                uContinue = uScan.nextLine().trim();
            }
            if (uContinue.equalsIgnoreCase("yes")) {
                System.out.println("You have chosen to check another grade.");
                System.out.println();
            } else {
                System.out.println("Goodbye");
                break;
            }
        }

    }
}
