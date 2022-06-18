package static_dynamic.variable.axion;

import java.io.IOException;

public class Mainnew {
    public static void main(String[]args) throws IOException {
        Elephant rex = new Elephant("rex");
        Elephant fluffy = new Elephant("fluffy");
        rex.PrintName();
        fluffy.PrintName();
    }
}
