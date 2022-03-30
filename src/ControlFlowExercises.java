import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //a. While loop
        Scanner scanner = new Scanner(System.in);
//        int i = 5;
//        while(i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        for(int i=5;i<=15;i++) {
//            System.out.println(i + " ");
//        }

        //b. Do while
//      int a = 0;
//        do {
//            System.out.print(a);
//            a += 2;
//        } while (a <= 100);
//
//        for(int t=0;t<=100;t+=2) {
//            System.out.print(t + " ");
//        }

//        int f = 100;
//        do {
//            System.out.print(f + " ");
//            f -= 5;
//        } while (f >= -10);
//
//        for(int i=100;i>=-10;i-=5) {
//            System.out.print(i + " ");
//        }

//        long g = 2;
//        do {
//            System.out.println(g);
//            g *= g;
//        } while (g < 1000000);
//
//        for(long i=2;i<1000000;i*=i) {
//            System.out.println(i);
//        }


//        for(int i=1;i<=100;i++) {
//            if(i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }



        System.out.print("Enter an integer to go up to: ");
        int userInput = Integer.parseInt(scanner.next());
        System.out.println("Here is your table!\n");
        System.out.println("Number | Squared | Cubed");
        System.out.println("------ | ------- | -----");
        for (int i=1; i<=userInput; i++) {
            System.out.printf ("%-6d | %-7d | %d\n", i, i*i, i*i*i);
        }






    }
}
