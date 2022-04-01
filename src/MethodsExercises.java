import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(addition(6,4));
        System.out.println(subtraction(10,4));
        System.out.println(multiplication(7,7));
        System.out.println(division(20,4));
        System.out.println(modulus(20,4));
        System.out.println(noAsterickMultiplier(20,4));
        System.out.print("Enter a number between 1 and 10:");
        int userInput = getInteger(1, 10);
        System.out.println(factorial(5));
        System.out.println("Validated input: " + userInput);
        getFactorial();
        rollYourDice();

    }
    //1. Basic Arithmetic:
    public static int addition (int x, int y){
        return x + y;
    }

    public static int subtraction (int x, int y){
        return x - y;
    }

    public static int multiplication (int x, int y){
        return x * y;
    }

    public static int division (int x, int y){
        return x / y;
    }

    public static int modulus (int x, int y){
        return x % y;
    }
//Bonus:

    public static int noAsterickMultiplier(int a, int b){
        int output = 0;
        for(int i=0; i<b;i++){
            output += a;
        }
        return output;
    }

    //2.
    public static int getInteger(int min, int max){
        Scanner getIntegerScanner = new Scanner(System.in);
        int userInput = getIntegerScanner.nextInt();
        if(userInput > min && userInput < max){
            return userInput;
        }else {
            System.out.print("Enter a number between " + "min" + "and" + "max" + ":");
            return getInteger(min,max);
        }
    }

    //3. factorial:
    public static long factorial(long a) {
        if (a == 1) {
            return 1;
        }
        return a * (factorial(a-1));
    }

    public static void getFactorial() {
        Scanner factorialScanner = new Scanner(System.in);
        System.out.print("Please enter an integer between 1 and 10: ");
        int base = getInteger(1, 10);
        long factorial = 1;
        String output = "! = 1";
        System.out.printf("1%s\n", output);
        for (int i=2;i<=base;i++) {
            factorial *= i;
            output += " x " + i;
            System.out.printf("%d%s = %d\n", i, output, factorial);
        }
        System.out.print("Would you like to continue? (y/n): ");
        if(factorialScanner.nextLine().toLowerCase().equals("y")) {
            getFactorial();
        }
    }

    //4. dice:
    public static int diceRoll (int a) {
        Random numb = new Random();
        return numb.nextInt(a) + 1;
    }

    public static void rollYourDice () {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println();

        System.out.print("Please Enter the number of sides for your dice: ");
        int entry = scan.nextInt();
        scan.nextLine();

        System.out.print("Ready to roll? y/n ");
        String readyToRoll = scan.nextLine();

        if (readyToRoll.equalsIgnoreCase("y")) {
            System.out.println(diceRoll(entry));
            System.out.println(diceRoll(entry));
        }

        else if (!readyToRoll.equalsIgnoreCase("y")){
            rollYourDice();
        }

        System.out.println("Would you like to play again?");
        String keepGoing = scan.nextLine();

        if (keepGoing.equalsIgnoreCase("y")) {
            rollYourDice();
        } else {
            System.out.println("Goodbye!");
        }
    }

    //5. Game Development 101:




}

