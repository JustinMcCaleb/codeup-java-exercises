import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
  static Scanner sc = new Scanner(System.in);
  static Random randNum = new Random();
//Exercise 1
    public static int addition(int a, int b){ return a + b; }

    public static int subtraction(int a, int b){ return a - b; }

    public static int multiplication(int a, int b){ return a * b; }

    public static int division(int a, int b){ return a / b; }

    public static int modulus(int a, int b) { return a % b; }

    public static void testArithmetic(){
        System.out.println(addition(2, 2) + " : 4");
        System.out.println(subtraction(5, 3) + " : 2");
        System.out.println(multiplication(6, 6) + " : 36");
        System.out.println(division(100, 10) + " : 10");
        System.out.println(modulus(5, 2) + " : 1");
    }

//Exercise 2
    public static void getInteger(int min, int max){

        System.out.printf("Enter a number between %d and %d: ", min, max);

        int userInput = sc.nextInt();

        if (userInput >= min && userInput <= max) {
            System.out.printf("%d is a valid input.\n", userInput);
        }else {
            System.out.printf("%d is not a valid number\n", userInput);
            getInteger(min, max);
        }
    }

//Exercise 3
    public static void factorial() {

        boolean gateKeeper = true;
        while (gateKeeper) {
            System.out.println("Enter an integer from 1 - 10: ");
            int userInput = sc.nextInt();
            if (userInput >= 1 && userInput <= 10) {
                System.out.printf("%d! = ", userInput);
                long output = 1;
                for (var a = 1; a <= userInput; a++) {
                    output *= a;
                    if (a < userInput){
                        System.out.print(a + " x ");
                    }else System.out.print(a + " = " + output + "\n");
                }
            } else {
                System.out.print("That is not a valid integer.\n");
            }
            System.out.println("Would you like to continue?");
            String continueOrNot = sc.next();
            gateKeeper = continueOrNot.equalsIgnoreCase("yes");
        }
    }

//Exercise 4
    public static void diceRoll() {
        System.out.println("Welcome to the dice roll game!");
        System.out.println("Please enter the number of sides you would like on your two dice: ");
        int numberOfSides = sc.nextInt();

        System.out.printf("%d sided dice, you got it! Type \"Roll\" and hit enter to roll.", numberOfSides);
        String roll = sc.next();
        boolean gateKeeper = true;
        while (gateKeeper) {
            if (roll.equalsIgnoreCase("roll")) {
                int dice1 = randNum.nextInt(numberOfSides);
                int dice2 = randNum.nextInt(numberOfSides);
                System.out.printf("Your roll is:\nDice One: %d\nDice Two: %d\n", dice1 + 1, dice2 + 1);
            }
            System.out.println("Feeling lucky? Roll again?");
            String rollAgain = sc.next();
            gateKeeper = rollAgain.equalsIgnoreCase("yes");
        }
    }

    public static void main(String[] args) {
        testArithmetic();

        getInteger(7, 666);

        factorial();

        diceRoll();
    }
}
