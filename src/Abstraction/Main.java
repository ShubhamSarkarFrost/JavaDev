package Abstraction;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        //Animal animal = new Animal("animal", "medium", 23.66)  - Because this is an abstract class there is no point on creation of an Object
        Dog dog = new Dog("Wolf", "Big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Sheppard", "big", 50.99));
        animals.add(new Fish("Goldfish", "small", 23.33));
        animals.add(new Fish("Baracuda", "large", 76.33));

        animals.add(new Horse("golden scarage", "very-big", 34.33));

        for(Animal animal:animals){
            doAnimalStuff(animal);
//            if(animal instanceof  Mammal currentMammel){
//                currentMammel.shedHair();
//            }
        }

    }
    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");

    }
}
