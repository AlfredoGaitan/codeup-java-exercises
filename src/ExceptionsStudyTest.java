public class ExceptionsStudyTest {
    public static void main(String[] args) {
        ExceptionsStudy exceptionsStudy = new ExceptionsStudy();
//        exceptionsStudy.subListMaker("this is a sentence");
        exceptionsStudy.echoWord();




    }
//     try {
//         String myTestString = "This is my Test string";
//         int myStringLength = myTestString.length();
//         System.out.println(myStringLength);
//         String mySubString = myTestString.substring(4,24);
//        System.out.println(mySubString);
//
//    } catch (IndexOutOfBoundsException iobx)  {
//         System.out.println("Index out of bounds!!!" + iobx);
//     }
//
//    }
}

//        try{
//            ExceptionsStudy study = new ExceptionsStudy();
//            System.out.println(Integer.parseInt(study.maybeAnInteger));
//            System.out.println(Integer.parseInt(study.certainlyNotAnInteger));
//        } catch (NumberFormatException nfx) {
//            System.out.println("Got an exception" + nfx);
//            nfx.printStackTrace();
//
//        }
//    }



//Mini-exercise: Investigate the substring method for String objects in the Java API. Find out what kind of exception it throws. Create a test class with a main method. Set up a try-catch block that defines a string and finds its length. Once you have the length of your string, modify your program so it creates a substring from your original string, but give it an index that doesn't exist so you get the error message.
//
//        Optional: play with the .getMessage and .printStackTrace methods.
//
//        Optional: what are some other ways you can get the same exception? Try to set up your program so as to produce and catch these exceptions.

//    Given the following code, investigate the kinds of exceptions it could throw and write a try-catch structure catching these exceptions and providing the appropriate output messages. Be careful of where exactly you begin your try-catch structure. Optionally, add a finally clause.
//
//        Test your code to make sure that the exceptions are indeed caught. Test the code by entering a null value as the method's String parameter (subListMaker(null) or String sentence = null; subListMaker(sentence)), and by entering negative integers and integers larger than the number of words in the sentence as the user inputs. Try to modify the warning for an improper integer to suggest to the user what range of integers is acceptable.
//
//        To search for what exceptions a method throws, use the following search string: Java + number of your Java JDK + API + name of method. For example, Java 16 API substring.
//        ```
//public void subListMaker(String sentence){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an integer");
//        int firstInt = scanner.nextInt();
//        System.out.println("Please enter another integer");
//        int secondInt = scanner.nextInt();
//        System.out.println(sentence);
//        ArrayList<String> wordArrayList = new ArrayList<String>();
//        String[] stringArray = sentence.split(" ");
//        for (String word : stringArray){
//        wordArrayList.add(word);
//        }
//        List<String> shorterList =  wordArrayList.subList(firstInt, secondInt);
//        String newSentence = String.join(" ", shorterList);
//        System.out.println(newSentence);
//        }
//        ```
//
//        Option 2 (challenge):
//        Write a method called subsentence that takes a string parameter. It asks the user for two integers, then uses the integers as indexes to create a subsentence from the sentence. Use whatever methods you want (ArrayList methods and String methods are suggested). Investigate all the exceptions your code can throw and write catch statements for them.