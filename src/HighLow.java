import java.util.Random;
import java.util.Scanner;

public class HighLow {
    static Scanner sc = new Scanner(System.in);
    static Random randNum = new Random();

    public static void  highLowMethod(){
        int luckyNumber = randNum.nextInt(100);
        luckyNumber = luckyNumber + 1;

        boolean gateKeeper = true;
        while (gateKeeper) {

            System.out.println("Guess a number between 1 - 100.");
            int userGuess = sc.nextInt();

            if (userGuess < luckyNumber) {
                System.out.println("HIGHER");
            } else if (userGuess > luckyNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS!");
                gateKeeper = false;
            }
        }
    }




    public static void main(String[] args) {
        highLowMethod();
    }
}
