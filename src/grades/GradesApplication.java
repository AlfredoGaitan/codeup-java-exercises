package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class GradesApplication {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();


        Student ted = new Student("Ted");
        ted.addGrade(95);
        ted.addGrade(81);
        ted.addGrade(92);


        Student chris = new Student("Chris");
        chris.addGrade(80);
        chris.addGrade(75);
        chris.addGrade(60);


        Student jose = new Student("Jose");
        jose.addGrade(90);
        jose.addGrade(95);
        jose.addGrade(91);



        Student tim = new Student("Tim");
        tim.addGrade(98);
        tim.addGrade(92);
        tim.addGrade(88);


        HashMap<String, Student> githubUserName = new HashMap<>();

        githubUserName.put("Ted_E_Bear", ted);
        githubUserName.put("ChrisRockLOL", chris);
        githubUserName.put("SwingForTheFences", jose);
        githubUserName.put("TimmyBucketsForDays", tim);


        System.out.println("Welcome to Our Student Info App");
        System.out.println("");
        System.out.println("Here are the Github usernames of our students:");
        System.out.println("");
        System.out.println(githubUserName.keySet());
        System.out.println("");
        System.out.println("What Student would you like to see more info on?");
        System.out.println("");
        String userInput = scan.nextLine();

        if(githubUserName.containsKey(userInput)) {
            System.out.println("Name: " + githubUserName.get(userInput).getName());
            System.out.println("Github user: " + userInput);
            System.out.println("Grade Average: " + githubUserName.get(userInput).getGradeAverage());
        }else {
            System.out.println("I'm sorry, this student does not exist");
        }
 //      while (true)
//        System.out.println("Would you like to see another Student");
        //System.out.println("");
//        String userChoice = scan.nextLine();
//        userChoice = userChoice.toLowerCase();
//        if (userChoice.equals("no") || userChoice)


//        Set<String> githubUserName = students.keySet();
//        for(String githubUserName : githubUserName){
//            System.out.printf(" |%s| ", githubUserName);
//        }

//        do{


//        System.out.println(ted.getName());
//        System.out.println(ted.getGradeAverage());
//        //System.out.println();
//        System.out.println(chris.getName());
//        System.out.println(chris.getGradeAverage());
//        System.out.println(jose.getName());
//        System.out.println(jose.getGradeAverage());
//        System.out.println(tim .getName());
//        System.out.println(tim.getGradeAverage());
//        System.out.println();


//    }

    }
}
