package grades;

import java.util.*;

public class Student{

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double totalGrade = 0;
        for(Integer x : grades) {
            totalGrade += x;
        }
        return totalGrade / grades.size();
    }

    public void allGrades() {
        System.out.println("Current Grades: " + this.grades);
    }

    public static void main(String[] args) {

        Student a = new Student("Justin");
        a.addGrade(100);
        a.addGrade(50);

        System.out.println(a.getName());
        System.out.println(a.grades);
        System.out.println(a.getGradeAverage());

        System.out.println("~*~*~*~*~*~*~");

        Student b = new Student("Cheyenne");
        b.addGrade(100);
        b.addGrade(99);

        System.out.println(b.getName());
        System.out.println(b.grades);
        System.out.println(b.getGradeAverage());

    }
}
