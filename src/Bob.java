import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please say something to Bob...");
        String userInput = sc.nextLine();
        if(userInput.endsWith("?")){
            System.out.println("Sure");
        }else if (userInput.endsWith("!")){
            System.out.println("Whoa chill out");
        }else if(userInput.isEmpty())   {

    }else {
           System.out.println("Whatever");
        }
}
}
