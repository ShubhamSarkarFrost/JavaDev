package Static_Instance;

import java.io.IOException;

class Dog {
    public void bark(){
        System.out.println("Bark Bark !!");
    }
}



public class Instance_Methods {

    public static void main(String[]Args) throws IOException {
        // Create an Object for Instance Method
        Dog Rex = new Dog();
        Rex.bark();


    }
}
