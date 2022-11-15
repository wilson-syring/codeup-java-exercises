import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HighLow {
    public static void guess() {
        while (true) {
            Scanner guessScan = new Scanner(System.in);
            System.out.println("Make your guess");
            String guess = guessScan.nextLine();
            int random = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            int number = Integer.parseInt(guess);
            if (number < random){
                System.out.println("That's too low, Joe");
            } else if (number > random) {
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
