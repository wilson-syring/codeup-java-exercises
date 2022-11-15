import java.util.Random;
import java.util.Scanner;


public class HighLow {
    public static void guess() {
        Random random = new Random();
        int rand = 0;
        while (true){
            rand = random.nextInt(100);
            if(rand !=0) break;
        }
        while (true) {
            Scanner guessScan = new Scanner(System.in);
            System.out.println("Choose between 1 and 100");
            String guess = guessScan.nextLine();
            int number = Integer.parseInt(guess);
            if (number < rand){
                System.out.println("That's too low, Joe");
            } else if (number > rand) {
                System.out.println("That's too high, Guy");
            }else{
                System.out.println("Right on target, Margret");
                break;
            }
        }
    }
    public static void main(String[] args) {
        guess();
    }
}
