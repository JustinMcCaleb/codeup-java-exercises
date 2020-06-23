package javaAssessmentOnePackage;

import util.Input;

import java.util.ArrayList;
import java.util.List;


public class javaControlStatements {

    //I can write Java control statements (if, if/else, switch, ternary) and loops (while, do-while, for, for-each) from memory.

    public static void main(String[] args) {
        Input in = new Input();

        //if statement
        System.out.println("Enter a whole number: ");
        int userInt = in.getInt();

        if (userInt < 50) {
            System.out.println("Less than 50.");
        }

        //if/else
        if (userInt %2 == 0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }

        //Switch
        System.out.println("Enter a number 1 - 5: ");
        int oneThruFive = in.getInt(1, 5);
        switch (oneThruFive) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
        }

        //ternary
        System.out.println("Enter a whole number");
        int a = in.getInt();
        String isLargerThan50 = (a > 50) ? "Your input is larger than 50" : "Your input is smaller than 50";

        System.out.println(isLargerThan50);


        //while loop
        boolean gateKeeper = true;
        while (gateKeeper) {
            System.out.println("Welcome to the while loop, would you like to exit?");
            gateKeeper = !in.yesNo();
        }

        //do-while
        boolean continueOrNot = false;
        do {
            System.out.println("Welcome to the do-while loop, would you like to continue?");
            continueOrNot = in.yesNo();
        }while (continueOrNot);

        //for loop
        for (int x = 0; x < 13; x += 1) {
            System.out.println(x);
        }

        List<String> friends = new ArrayList<>();
        friends.add("Cheyenne");
        friends.add("Cameron");
        friends.add("Strader");
        friends.add("Walsh");

        for (String friend : friends) {
            System.out.println(friend);
        }


    }
}
