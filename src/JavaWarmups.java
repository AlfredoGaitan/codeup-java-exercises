public class JavaWarmups {
    public static void main(String[] args) {
        returnFirstCapitalLetter("hellO"); // returns 'O'
        returnFirstCapitalLetter("hello");// returns ' '
        returnFirstCapitalLetter("hEllo"); // returns 'E'
        returnFirstCapitalLetter("hELlO"); // returns 'E'
        returnFirstCapitalLetter("H"); // returns 'H'


    }
    public static char returnFirstCapitalLetter(String string){
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z' ) return string.charAt(i);
        }
        return ' ';
    }
//       public static char returnFirstCapitalLetter(String input) {
//        for (int i = 0; i < input.length(); i++)
//            if (input.charAt(i) === Character.isUpperCase(input.charAt(i)));
//                return input.charAt(i);
//
//        }
//        return "";





    }









//        ================================= WARM UP
//
//        Create a Java class, JavaWarmups. Add a main method to test the warmup methods.
//
//                Create a method, returnFirstCapitalLetter, that takes in a string and returns the first capital letter as a char. If no capital letter is found, return a single space character ' '. Assume only letters in the input string and all possible inputs will have at least one letter.
//
//        Examples...
//

