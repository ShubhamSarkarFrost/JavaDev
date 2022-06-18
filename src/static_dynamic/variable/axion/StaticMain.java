package static_dynamic.variable.axion;

import java.io.IOException;

public class StaticMain {

    public static void main(String[]args) throws IOException{
        Dog rex = new Dog("rex");
        Dog fluffy = new Dog("fluffy");
        rex.PrintName();
        fluffy.PrintName();
    }
}

