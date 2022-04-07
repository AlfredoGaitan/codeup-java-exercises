package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades = new ArrayList<Integer>();

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public Student(String name) {
        this.name = name;

    }



    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int total = 0;
        for (int i = 0; i < grades.size(); i++){
            total += grades.get(i);
        }
        return total / grades.size();
    }
}
