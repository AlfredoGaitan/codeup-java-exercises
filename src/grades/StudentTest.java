package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student ted = new Student("Ted");
            ted.addGrade(90);
            ted.addGrade(95);
            ted.addGrade(98);

        System.out.println(ted.getGrades());
        System.out.println(ted.getGradeAverage());

        }
 }

