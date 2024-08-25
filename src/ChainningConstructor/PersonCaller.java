package ChainningConstructor;

public class PersonCaller {

    public static void main(String[] args) {
        Person person1 = new Person(); // Calls Constructor 1
        person1.displayInfo();

        Person person2 = new Person("Alice"); // Calls Constructor 2
        person2.displayInfo();

        Person person3 = new Person("Bob", 25); // Calls Constructor 3
        person3.displayInfo();

        Person person4 = new Person("Charlie", 30, "New York"); // Calls Constructor 4
        person4.displayInfo();
    }
}
