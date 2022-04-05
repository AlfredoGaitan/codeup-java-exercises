import java.util.Arrays;

public class ArraysLecture {
    public static void main(String[] args) {
        // we declare a reference variable, numbers, of type Integer Array
        int[] numbers;
        // we assign an actual array to the numbers reference
        numbers = new int[5];
        numbers[0] = 78;
        numbers[1] = 76;
        numbers[2] = 43;
        numbers[3] = 12;
        numbers[4] = -56;

//        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        Arrays.sort(numbers);
        //**NOT** numbers.sort();
        System.out.println(numbers[0]);

        //Array initializer syntax

        String[] synonymsOfWeird = {"string", "bizarre", "uncanny", "odd", "peculiar", "uncommon"};
        System.out.println(synonymsOfWeird[2]);

        //enhanced for loop:
        for(String synonymOfWeird: synonymsOfWeird){
            System.out.println(synonymOfWeird);
        }



            //Array with for loop:
//        String[] languages = {"html", "css", "javascript", "java"};
//
//        for (int i = 0; i < languages.length; i += 1) {
//            System.out.println(languages[i]);




        // using the array initializer syntax
        String[] beatles = {"John", "Paul", "Ringo"};

            System.out.println(beatles.length); // 3

            System.out.println(beatles[0]); // "John"
            System.out.println(beatles[1]); // "Paul"
            System.out.println(beatles[2]); // "Ringo"


        //Create an Array of five bytes using either array variable declaration or array initialization syntax. use either a for loop or enhanced for loop to OP the values to the terminal.

        int[] bytes;
        // we assign an actual array to the numbers reference
        bytes = new int[8];
        bytes[0] = 1;
        bytes[1] = 2;
        bytes[2] = 4;
        bytes[3] = 8;
        bytes[4] = 4;
        bytes[5] = 8;
        bytes[6] = 2;
        bytes[7] = 1;

        System.out.println(bytes[3]);
        }


}

