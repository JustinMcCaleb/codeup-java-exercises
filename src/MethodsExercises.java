import java.util.Scanner;

public class MethodsExercises {

//Exercise 1
    public static int addition(int a, int b){
        return a + b;
    }

    public static int subtraction(int a, int b){
        return a - b;
    }

    public static int multiplication(int a, int b){
        return a * b;
    }

    public static int division(int a, int b){
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

//Exercise 2
    public static void getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ", min, max);

        int userInput = sc.nextInt();

        if (userInput >= min && userInput <= max) {
            System.out.printf("%d is a valid input.", userInput);
        }else {
            System.out.printf("%d is not a valid number\n", userInput);
            getInteger(min, max);
        }
    }

//Exercise 3


    public static void main(String[] args) {

        System.out.println(addition(2, 2) + " : 4");

        System.out.println(subtraction(5, 3) + " : 2");

        System.out.println(multiplication(6, 6) + " : 36");

        System.out.println(division(100, 10) + " : 10");

        System.out.println(modulus(5, 2) + " : 1");

        getInteger(7, 666);
    }
}
