package util;

public class InputTest {
    public static void main(String[] args) {


        Input in = new Input();
//        System.out.println("Please enter a word");
//        String userInputString = in.getString();
//        System.out.println(userInputString);
//
//        System.out.println("Will you continue?");
//        boolean trueFalse = in.yesNo();
//        System.out.println(trueFalse);

//        System.out.println("Please enter a whole number");
//        int userInputInt = in.getInt();
//        System.out.println("You entered " + userInputInt);

//        System.out.println("Enter an integer between 1 and 10");
//        int numRange = in.getInt(1, 10);
//        System.out.println(numRange + " is between 1 and 10");
//
        System.out.println("Please enter a number w/ decimals.");
        double dubNum = in.getDouble();
        System.out.println("Your number is: " + dubNum);
//
//        System.out.println("Please enter a number w/ decimals that is between 1 and 10.");
//        double dubRange = in.getDouble(1.0, 10.0);
//        System.out.println("Your number is: " + dubRange);

    }


}
