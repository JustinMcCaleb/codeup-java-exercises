package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
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
                    for (Movie movie : movies) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                    break;
                case 2:
                    gateKeeper = true;
                    for (Movie movie : movies) {
                        if (movie.getCategory().equalsIgnoreCase("animated")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    gateKeeper = true;
                    for(Movie movie : movies) {
                        if (movie.getCategory().equalsIgnoreCase("drama")){
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 4:
                    gateKeeper = true;
                    for (Movie movie : movies){
                        if(movie.getCategory().equalsIgnoreCase("horror")){
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 5:
                    gateKeeper = true;
                    for (Movie movie : movies){
                        if (movie.getCategory().equalsIgnoreCase("scifi")){
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
            }
        }while (gateKeeper);
    }
}
