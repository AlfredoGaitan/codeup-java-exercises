import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = {
                new Person("Brianna"),
                new Person("Alex"),
                new Person("Isaiah"),
        };
        System.out.println("people length: " + people.length);
        for (Person person: people){
            System.out.println(person.getName());
        }

        Person[] newPerson = addPerson(people, new Person("Jax"));
        newPerson = addPerson(newPerson, new Person("Milo"));

        System.out.println("newPerson lenght: " + newPerson.length);
        for(Person person: newPerson){
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] inputPeople, Person newPerson){
        Person[] returnPeople = Arrays.copyOf(inputPeople, inputPeople.length + 1);
      returnPeople[inputPeople.length] = newPerson;
      return returnPeople;


    }
}
