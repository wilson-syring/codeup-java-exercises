package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(Scanner scan) {
        this.scanner = scan;
    }

    public String getString(){
        return this.scanner.nextLine();
    }

    public boolean yesNo(String answer){
        String resp = this.scanner.nextLine();
        if(resp.equalsIgnoreCase("y")||resp.equalsIgnoreCase("yes")){
            return true;
        } else if (resp.equalsIgnoreCase("n")||resp.equalsIgnoreCase("no")) {
            return false;
        }else return false;
    }


    public int getInt(int min, int max) {
        boolean exitConditionMet = false;
        int number = Integer.MIN_VALUE;
        while(!exitConditionMet) {
            System.out.println("Enter a number between " + min + " and " + max + ":");
            number = this.scanner.nextInt();
            this.scanner.nextLine();
            if (number >= min && number <= max) {
                System.out.println(number + " is in the target range");
                exitConditionMet = true;
            } else {
                System.out.println(number + " is out of target range");
                continue;
            }
        }
        return number;
    }

    public double getDouble(double min, double max) {
        boolean exitConditionMet = false;
        double number = Double.MIN_VALUE;
        while(!exitConditionMet) {
            System.out.println("Enter a number between " + min + " and " + max + ":");
            number = this.scanner.nextDouble();
            this.scanner.nextLine();
            if (number >= min && number <= max) {
                System.out.println(number + " is in the target range");
                exitConditionMet = true;
            } else {
                System.out.println(number + " is out of target range");
                continue;
            }
        }
        return number;
    }
    public double getDouble(){
        if(this.scanner.hasNextDouble()){
            double myDouble = this.scanner.nextDouble();
            this.scanner.nextLine();
            return myDouble;
        }else{
            return Double.MIN_VALUE;
        }
    }

//public static void main(String[] args){
//        Scanner myScanner = new Scanner(System.in);
//        Input something = new Input(myScanner);
//    }
}
