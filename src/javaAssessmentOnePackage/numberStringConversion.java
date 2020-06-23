package javaAssessmentOnePackage;

import util.Input;

public class numberStringConversion {

    public static void main(String[] args) {
        Input in = new Input();

        //I can convert a numeric string to a number and a number to a numeric string.


        int a = 666;
        int b = 13;

        String one = Integer.toString(a);
        System.out.println(one);

        String two = Integer.toString(b);
        System.out.println(two);


        System.out.println("Enter a number: ");
        String numString = in.getString();
        try {
            int num = Integer.parseInt(numString);
            System.out.println(num);
            if (num < 10) {
                System.out.println("1");
            }
        }catch (NumberFormatException e){
            System.out.println("Shit, something went wrong");
        }

    }
}
