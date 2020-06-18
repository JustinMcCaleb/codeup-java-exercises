package grades;

import java.util.*;

public class GradesApplication {
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

    }
}
