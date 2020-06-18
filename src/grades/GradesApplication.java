package grades;

import util.Input;

import java.util.*;


public class GradesApplication {

    public static void studentInfo(HashMap<String, Student> students) {
        Input in = new Input();

        System.out.println("Welcome!\n");

        boolean gateKeeper = true;

        while (gateKeeper) {

            System.out.println("Here are the Github usernames of our students: \n");

            for (String x : students.keySet()) {
                System.out.print("|" + x + "| ");
            }

            System.out.println("\n\nType in the Username(case sensitive) you would like to see more information on: ");

            String studentRequested = in.getString();

            if (students.containsKey(studentRequested)) {
                System.out.println("~*~*~*~*~*~*~~*~*~*~*~*~*~*~");
                System.out.printf("Name: %s\nGitHub Username: %s\nCurrent Grade Average: %.1f", students.get(studentRequested).getName(), studentRequested, students.get(studentRequested).getGradeAverage());
                System.out.println("\n~*~*~*~*~*~*~~*~*~*~*~*~*~*~");
            }else {
                System.out.printf("Sorry, no student found with the GitHub username: %s", studentRequested);
            }
            System.out.println("\n\nWould you like to continue? [ Y / N ]");
            gateKeeper = in.yesNo();
            in.clearNextLine();
        }


    }

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Wyatt");
        student1.addGrade(95);
        student1.addGrade(87);
        student1.addGrade(99);


        Student student2 = new Student("Cameron");
        student2.addGrade(90);
        student2.addGrade(92);
        student2.addGrade(84);


        Student student3 = new Student("Robert");
        student3.addGrade(90);
        student3.addGrade(81);
        student3.addGrade(78);


        Student student4 = new Student("Thomas");
        student4.addGrade(100);
        student4.addGrade(100);
        student4.addGrade(100);


        students.put("T-Rex", student1);
        students.put("Rabbit", student2);
        students.put("LizardKing", student3);
        students.put("Neo", student4);


        studentInfo(students);

    }
}
