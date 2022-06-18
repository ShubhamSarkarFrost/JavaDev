package static_dynamic.variable.axion;

public class Dog {

    private static String name;

    public Dog(String name) {
        Dog.name = name;
    }

    public void PrintName() {
        System.out.println("name= " + name);
    }
}
