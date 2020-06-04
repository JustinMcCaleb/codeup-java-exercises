import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Bob is a lackadaisical teenager but he wants to have a conversation regardless.\nAsk him a question but don't expect a good answer.");


        boolean continueOrNot = true;

        while (continueOrNot) {

            System.out.print("Enter your question here: ");
            String userQuestion = sc.nextLine();

            if (userQuestion.endsWith("?")) {
                System.out.println("Sure");
            }else if (userQuestion.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            }else if (userQuestion.length() == 0){
                System.out.println("Fine. Be that way!");
            }else {
                System.out.println("Whatever man.");
            }
            System.out.print("Do you want to ask Bob another question? [ Y / N ]");
            String askAnotherQuestion = sc.next();
            sc.nextLine();
            continueOrNot = askAnotherQuestion.equalsIgnoreCase("y");
        }

    }
}
