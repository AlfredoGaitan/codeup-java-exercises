public class Person {
    private String name;
    private int age;

    public Person(String inputName, int inputAge) {
        this.name = inputName;
        this.age = inputAge;
    }

    public Person(String inputName) {
        this.name = inputName;
    }

    public Person() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int inputAge) {
        this.age = inputAge;
    }

    public void sayHello() {
        System.out.println(this.name + " say Hello!");
    }

    public static void main(String[] args) {
        Person person0 = new Person("Drew");

        System.out.println(person0.getName());

        person0.setName("Tom");

        person0.sayHello();
          Person person1 = new Person("Russel");
          Person person2 = person1;
          Person person3 = person2;
//        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Troy");
        System.out.println(person1.getName());

    }
}


