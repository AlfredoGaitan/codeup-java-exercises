import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        //System.out.println("ConsoleExercises");
        Scanner scanner = new Scanner(System.in);
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f. \n", pi);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int i = 0;
//        while(i != -1) {
//            System.out.println("Enter an integer: ");
//            try {
//                i = scanner.nextInt();
//                System.out.printf("\nThe integer is: %d \n", i);
//            } catch(InputMismatchException ime) {
//                System.out.println("\nThat is not an integer. \n");
//                i = 0;
//            }
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter three words: ");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.printf("\n The words are \"%s\" \"%s\" \"%s\".",firstWord, secondWord, thirdWord);


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a sentence: ");
//        String userSentence = scanner.nextLine();
//        System.out.printf("\nThe sentence is: %s", userSentence);


//        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the lenght: ");
        String lenghtInput = scanner.nextLine();
        System.out.println("enter the width: ");
        String widthInput = scanner.nextLine();

        float length = Float.parseFloat(lenghtInput);
        float width = Float.parseFloat(widthInput);
        System.out.println("the are is: " + (length * width) + ".");
        System.out.println("the perimeter is: " + (length * 2 + width * 2) + ".");

    }
}
