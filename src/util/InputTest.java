package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Input test = new Input(myScanner);
        System.out.println("enter a word");
        test.getString();
        test.getInt(1, 100);
        test.getDouble(1.25, 10.25);
        test.yesNo();
    }
}
