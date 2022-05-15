package person.axion;

import java.io.IOException;

public class Main {

    public static void main(String[]Args) throws IOException{
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("is Teen =" + person.isTeen());
        System.out.println("FullName = "+ person.getFullName());
        person.setFirstName("Shubham");
        person.setLastName("");
        person.setAge(12);
        System.out.println("is Teen =" + person.isTeen());
        System.out.println("FullName = "+ person.getFullName());
        person.setFirstName("");
        person.setLastName("Sarkar");
        person.setAge(19);
        System.out.println("is Teen =" + person.isTeen());
        System.out.println("FullName = "+ person.getFullName());
        person.setFirstName("Shubham");
        person.setLastName("Sarkar");
        person.setAge(30);
        System.out.println("is Teen =" + person.isTeen());
        System.out.println("FullName = "+ person.getFullName());
    }
}
