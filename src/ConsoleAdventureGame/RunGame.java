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

    //generats a random hitPoint value
    static int hitPoints() {
        return randNum.nextInt(20);
    }

    //array of strings for random animals
    static String[] animals = {
            "Deer",
            "Boar",
            "Squirrel",
            "Fox",
            "Rabbit",
            "Anteater",
            "Bigfoot",
    };

    //array of strings for random objects
    static String[] objects = {
            "rock",
            "tree",
            "bush",
    };

    //array of strings for random villains
    static String[] villains = {
            "Demon",
            "Black Bear",
            "Ghost",
            "Wolf",
            "Wolverine",
    };

    //uses the random number generator to select a random element from passed in array
    static String randomElement(String[] array){
        return array[randNum.nextInt(array.length)];
    }

    static void investigate(int x) {
        System.out.println("You slowly approach where the sound is coming from");
        if (x < 5) {
            System.out.printf("Suddenly a %s jumps out from behind a %s and runs away.", randomElement(animals), randomElement(objects));
        }else {
            Villain villain = new VillianCreator();
            villain.setHitPoints(hitPoints());
            villain.setName(randomElement(villains));
            System.out.printf("A %s appears and starts to attack you", villain.getName());
        }
    }

    static void gameFlow() {
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

        System.out.println("\"Welcome to the edge of the Dead Forest\"\n\n\"What's your name Hero?\"");

        String heroName = in.getString();

        Hero hero = new Hero(heroName);

        System.out.printf("\"Well %s, would you like to enter?\"", heroName);

        if (in.yesNo()) {

            System.out.println("\"Proceed at your own risk...\"\n\n\nYou walk down the path as the light gets dimmer. After a few hours pass you hear a noise nearby.\n\nDo you investigate?");
            if(in.yesNo()) {
                investigate(probability());
            }else {
                System.out.println("Fuck that... *you keep walking down path*");
            }






        }else {
            System.out.println("Wise choice.");
        }







    }

    public static void main(String[] args) {

        gameFlow();

    }
}
