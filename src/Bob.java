import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner bobScan = new Scanner(System.in);
        System.out.println("Bob asks, what do you want?");
        System.out.println();

        while(true) {
            System.out.print("Give Bob some info: ");
            String userResponse = bobScan.nextLine().trim();

            if (userResponse.endsWith("?")) {
                System.out.println("Awe man, fine!");
            } else if (userResponse.endsWith("!")) {
                System.out.println("Whoa, why you gotta be yelling all the time?");
            } else if (userResponse.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println();

            System.out.println("Bob wants to know, is there anything else? yes or no");
            String yourReply = bobScan.nextLine().trim();

            while (!yourReply.equalsIgnoreCase("yes") && !yourReply.equalsIgnoreCase("no")) {
                System.out.println("That is not yes or no");
                yourReply = bobScan.nextLine().trim();
            }
            if (yourReply.equalsIgnoreCase("yes")) {
                System.out.println("Really?");
                System.out.println();
            } else {
                System.out.println("FINE! im out...");
                break;
            }
        }

    }
}
