package animalInherit.axion;
/**
 *
 */

import java.io.IOException;

public class Main {

    public static void main(String[]Args) throws IOException{
        Animal animal = new Animal("Snake",1,1,7,5);
        Dog dog = new Dog("Yorkie",8,20,2,4,1,20,"fluffy");
        dog.eat();
//        dog.walk();
        dog.run();

    }
}
