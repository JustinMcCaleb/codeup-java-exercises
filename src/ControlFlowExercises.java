import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {


          /////////////////////
         //// Loop Basics ////
        /////////////////////


            //While Loop

                //int i = 5;
                //while (i <= 15){
                //    System.out.print(i + " ");
                //    i++;
                //}


            //Do While Loop

                //int j = 100;
                //do {
                //    System.out.println(j);
                //    j -= 5;
                //}while (j >= -10);

                //long k = 2;
                //do {
                //    System.out.println(k);
                //    k *= k;
                //}while(k < 1000000);


            // Refactor above two loops into for loops

                //for (int l = 100; l >= -10; l-= 5) {
                //    System.out.println(l);
                //}

                //for (long m = 2; m < 1000000; m *= m) {
                //    System.out.println(m);
                //}



          ///////////////////////
         ////// Fizzbuzz ///////
        ///////////////////////


                //for (int n = 1; n <= 100; n++) {
                //    if (n % 3 == 0 && n % 5 == 0) {
                //        System.out.println("FizzBuzz");
                //    }else if (n % 3 == 0) {
                //        System.out.println("Fizz");
                //    }else if (n % 5 == 0) {
                //        System.out.println("Buzz");
                //    }else {
                //        System.out.println(n);
                //    }
                //}


            //Display a table of powers

                    Scanner sc = new Scanner(System.in);

                    System.out.print("What number would you like to go up to? ");

                    int userInputInt = sc.nextInt();

                    System.out.println("Here is your table");

                    String header1 = "number";
                    String header2 = "squared";
                    String header3 = "cubed";

                    String seperator = "|";
                    String dashes1 = "------";
                    String dashes2 = "-------";
                    String dashes3 = "-----";

                    System.out.printf("%-6s %s %-7s %s %-5s\n", header1, seperator, header2, seperator, header3);
                    System.out.printf("%-6s %s %-7s %s %-5s\n", dashes1, seperator, dashes2, seperator, dashes3);


                    for(int a = 1; a <= userInputInt; a++){
                            int number = a;

                            System.out.printf("%-6d %s %-7d %s %-5d\n", number, seperator, number * number, seperator, number * number * number);
                    }




                System.out.print("Enter a numerical grade between 0 - 100: ");

                    byte grade = sc.nextByte();

                    gradeLetterLogic(grade);

                System.out.print("Do you wish to continue? [ Y / N ]");
                    String userContinue = sc.next();
                    if(userContinue.equalsIgnoreCase("Y")) {
                       gradeLoop();
                    }


    }

    public static void gradeLetterLogic(byte grade) {
            if (grade <= 100 && grade >= 88) {
                System.out.println("A");
            }else if (grade <= 87 && grade >= 80){
                System.out.println("B");
            }else if (grade <= 79 && grade >= 67) {
                System.out.println("C");
            }else if (grade <= 66 && grade >= 60) {
                System.out.println("D");
            }else {
                System.out.println("F");
            }
    }

    public static void gradeLoop () {
        Scanner sc = new Scanner(System.in);
        boolean startStop = true;
        while (startStop) {
            System.out.print("Enter a numerical grade between 0 - 100: ");
            byte grade2 = sc.nextByte();
            gradeLetterLogic(grade2);
            System.out.print("Do you wish to continue? [ Y / N ]");
            String userContinue = sc.next();
            startStop = userContinue.equalsIgnoreCase("Y");
        }
    }
}
