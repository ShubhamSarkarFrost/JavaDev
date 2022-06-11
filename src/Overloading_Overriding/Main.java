package Overloading_Overriding;

import java.io.IOException;

public class Main {

    public static void main(String[]args) throws IOException{

        Dog_Overload ob = new Dog_Overload();
        German_shepard gs = new German_shepard();
        ob.bark();
        gs.bark();
    }
}
