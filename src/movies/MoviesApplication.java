package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Input movieInput = new Input(myScanner);
        boolean breakOut = true;
        Movie[] movies = MoviesArray.findAll();
        System.out.println("<========Movie Time========>");
        while (breakOut) {
            System.out.println("What would you like to do? ");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the sci-fi category");

            if (choice == String.valueOf(0)) {
                return;
            } else if (choice == String.valueOf(1)) {
                System.out.println("Listing all movies: ");
                for (Movie movie : movies) {
                    System.out.println(movie.getName());
                }
                break;
            } else if (choice == String.valueOf(2)) {

                break;
            } else if (choice == String.valueOf(3)) {

                break;
            } else if (choice == String.valueOf(4)) {

                break;
            } else if (choice == String.valueOf(5)) {

                break;
            }
        }
    }
}
