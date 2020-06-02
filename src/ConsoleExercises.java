import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {


        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f.\n", pi);

//
//    // EXPLORE THE SCANNER CLASS
//        //Part 1
//
        Scanner sc = new Scanner(System.in);
//
        System.out.println("Please enter an integer: ");

        int userInput = sc.nextInt();

        System.out.println(userInput);
//
//
//
//        //Part 2
        System.out.println("Enter three words: ");

        String firstInputWord = sc.next();
        String secondInputWord = sc.next();
        String thirdInputWord = sc.nextLine();

        System.out.println(firstInputWord);
        System.out.println(secondInputWord);
        System.out.println(thirdInputWord);
//
//
//
//        //Part 3
        System.out.println("Please enter a sentence: ");

        String userInputSentence = sc.nextLine();
        System.out.println(userInputSentence);


    //Calculate the perimeter and area of Codeup's classrooms
        //Part 1
        System.out.println("Enter the length: ");
        int lengthInput = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the width: ");
        int widthInput = Integer.parseInt(sc.nextLine());

        System.out.printf("The area of your rectangle is: %s\n", lengthInput * widthInput);
        System.out.printf("The perimeter of your rectangle is: : %s\n", (widthInput * 2) + (lengthInput *2));

    }
}
