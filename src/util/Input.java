package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public String getString(){
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        String userInput = this.scanner.next();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
    }

    public int getInt(){
        return this.scanner.nextInt();
    }

    public int getInt(int min, int max){
        int userInt = this.scanner.nextInt();
        if (userInt < min || userInt > max) {
            boolean gateKeeper = true;
            while (gateKeeper) {
                System.out.printf("That integer is not within the bounds.\nPlease enter an integer between %d and %d", min, max);
                int userInt2 = this.scanner.nextInt();
                if (userInt2 >= min && userInt2 <= max) {
                    gateKeeper = false;
                }
            }
        }
        return userInt;
    }

    public int getDouble(){
        return this.scanner.nextInt();
    }

    public double getDouble(Double min, Double max){
        int userInt = this.scanner.nextInt();
        if (userInt < min || userInt > max) {
            boolean gateKeeper = true;
            while (gateKeeper) {
                System.out.printf("That integer is not within the bounds.\nPlease enter an integer between %f and %f", min, max);
                int userInt2 = this.scanner.nextInt();
                if (userInt2 >= min && userInt2 <= max) {
                    gateKeeper = false;
                }
            }
        }
        return userInt;
    }
}
