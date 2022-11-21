package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static int movieList() {
        Scanner movieScan = new Scanner(System.in);
        Input movies = new Input(movieScan);
        System.out.println("<==============Movie Time==============>");
        System.out.println("Please make a selection");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the sci-fi category");
        System.out.println("6 - view movies in the sci-fi musical");
        System.out.println("7 - view movies in the sci-fi comedy");
        return movies.getInt();
    }


    public static void movieArr() {
        int list = movieList();
        for (int l = 0; l < MoviesArray.findAll().length; l++) {
            String movieCat = MoviesArray.findAll()[l].getCategory();
            String movieName = MoviesArray.findAll()[l].getName();
            if (list == 0) {
                System.out.println("Thank you for using Movie Time");
                break;
            } else if (list == 1) {
                System.out.println(movieName);
            } else if (list == 2 && movieCat == "animated") {
                System.out.println(movieName);
            } else if (list == 3 && movieCat == "drama") {
                System.out.println(movieName);
            } else if (list == 4 && movieCat == "horror") {
                System.out.println(movieName);
            } else if (list == 5 && movieCat == "sci-fi") {
                System.out.println(movieName);
            } else if (list == 6 && movieCat == "musical") {
                System.out.println(movieName);
            } else if (list == 7 && movieCat == "comedy") {
                System.out.println(movieName);
            }

        }
        if (list == 0) {
        } else {
            movieArr();
        }
    }

    public static void main(String[] args) {

        movieArr();

    }
}

