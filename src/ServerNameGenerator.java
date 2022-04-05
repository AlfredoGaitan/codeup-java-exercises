import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjectives = {"Charming", "Cruel", "Fantastic", " Gentle", " Rough", "Perfect", "Sharp", "Tasty", "Zealous", "Huge"};
    public static String[] nouns = {"Mother", "Father", "Dog", "Planet", "Airport", "Computer", "Cat", "Student", "Teacher", "Child"};

    public static void main(String[] args) {
        for(int i = 0; i < 20; i++){
            System.out.println(returnRandom(adjectives) + "-" + returnRandom(nouns));
        }
    }

    public static String returnRandom(String[] inputArr){
        Random random = new Random();
        return inputArr[random.nextInt(inputArr.length - 1)];
    }
}
