package ConsoleAdventureGame;

import util.Input;
import java.util.Random;

public class RunGame {
    static Input in = new Input();

    static Random randNum = new Random();

    //generates a number between 1 - 10 that will determine if the attack was successful or not
    static int probability() {
        return randNum.nextInt(10);
    }

    public static void main(String[] args) {

        System.out.println(
                           "|////|   |///|    |////|             |////|  |/////|     |//////|\n" +
                           "|////|   |///|    |////|             |////|  |/////|     |//////|\n" +
                           "|////|   |///|    |////|             |////|  |/////|     |//////|\n" +
                           "|////|   |///|    |////|             |////|  |/////|     |//////|\n" +
                           "|////|   |///|    |////|             |////|  |/////|     |//////|\n" +
                           "|////|   |///|    |////|             |////|  |/////|     |//////|\n" +
                           "|////|   |///|    |////|             |////|  |/////|     |//////|\n" +
                           "|////|   |///|    |////|             |////|  |/////|     |//////|\n" +
                           "|////|   |///|    |////|             |////|  |/////|     |//////|\n" +
                           "|////|   |///|    |////|             |////|  |/////|     |//////|\n" +
                           "|////|   |///|    |////|             |////|  |/////|     |//////|\n" +
                           "|////|   |///|    |////|             |////|  |/////|     |//////|\n" +
                           "|////|   |///|    |////|             |////|  |/////|     |//////|\n" +
                           "========================             ============================\n"  );

        System.out.println("Welcome to the edge of the Dead Forest\n\nWhat's your name Hero?");

        String heroName = in.getString();

        Hero justin = new Hero(heroName);

        System.out.printf("Well %s, would you like to enter?", heroName);

        if (in.yesNo()) {
            System.out.println("Proceed at your own risk...");


        }




        System.out.println(justin.punch(probability()));

    }
}
