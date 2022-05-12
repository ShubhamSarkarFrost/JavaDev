package car.axiom;

import java.io.IOException;

public class Main {

    public static void main(String[]Args) throws IOException{

        Car porshe = new Car();
        Car Chervolet = new Car();
        Car Lamborgini = new Car();

        porshe.setModel("Carrera");
        System.out.println("Model is " +  porshe.getModel());
        Lamborgini.setModel("Gallardo");
        System.out.println("Model is "+ Lamborgini.getModel());

    }
}
