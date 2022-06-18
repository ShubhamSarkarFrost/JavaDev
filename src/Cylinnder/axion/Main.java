package Cylinnder.axion;

import java.io.IOException;

public class Main {

    public static void main(String[] Args) throws IOException {
        Circle circle = new Circle(3.75);
        System.out.println("circle radius" + circle.getRadius());
        System.out.println("circle area"+ circle.getArea());
        Cylinder cylinder = new Cylinder(5.55,7.25);
        System.out.println("cylinder height"+ cylinder.getHeight());
        System.out.println("cylinder volume"+ cylinder.getVolume());
        System.out.println("cylinder area"+ cylinder.getArea());
        System.out.println("cylinder radius"+ cylinder.getRadius());

    }
}
