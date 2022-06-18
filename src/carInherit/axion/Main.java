package carInherit.axion;

import java.io.IOException;

public class Main {

    public static void main(String[]Args) throws IOException{

        Lamborgini gallardo = new Lamborgini(48);
        gallardo.steer(45);
        gallardo.accelerate(30);
        gallardo.accelerate(20);
        gallardo.accelerate(-42);

    }
}
