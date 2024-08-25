package ChainningConstructor;

public class Person {
    String name;
    int age;
    String city;

    // Constructor 1: Default constructor
    public Person() {
        this("Unknown", 0, "Unknown"); // Calls Constructor 3
    }

    // Constructor 2: Constructor with 1 parameter
    public Person(String name) {
        this(name, 0, "Unknown"); // Calls Constructor 3
    }

    // Constructor 3: Constructor with 2 parameters
    public Person(String name, int age) {
        this(name, age, "Unknown"); // Calls Constructor 3
    }

    // Constructor 4: Constructor with 3 parameters
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }
}
