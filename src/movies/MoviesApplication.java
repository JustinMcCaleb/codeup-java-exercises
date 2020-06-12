package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    static MoviesArray movie = new MoviesArray();

    public static void main(String[] args) {
        System.out.println();
        Input in = new Input();

        System.out.println("Welcome to the Movie App!");

        boolean gateKeeper = false;

        do {
            System.out.println("What would you like to do?\n\n0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the sci-fi category\n\nEnter your choice: ");
            int userInput = in.getInt(0,5);

            switch (userInput) {
                case 0:
                    gateKeeper = false;
                    break;
                case 1:
                    gateKeeper = true;
                    System.out.println("all movies");
                    System.out.println(Arrays.toString(MoviesArray.findAll()));
                    break;
                case 2:
                    gateKeeper = true;
                    System.out.println("animated");
                    break;
                case 3:
                    gateKeeper = true;
                    System.out.println("drama");
                    break;
                case 4:
                    gateKeeper = true;
                    System.out.println("horror");
                    break;
                case 5:
                    gateKeeper = true;
                    System.out.println("sci-fi");
                    break;
            }
        }while (gateKeeper);
    }
}
