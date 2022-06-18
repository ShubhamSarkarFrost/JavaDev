package PoolArea.axion;

import java.io.IOException;

public class Main {

    public static void main(String[]args) throws IOException{
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("Width of Rectangle "+rectangle.getWidth());
        System.out.println("Length of Rectangle"+rectangle.getLength());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("Height of Cuboid "+cuboid.getHeight());
        System.out.println("Width of Cuboid "+cuboid.getWidth());
        System.out.println("Length of Cuboid "+cuboid.getWidth());
        System.out.println("Volume of Cuboid "+cuboid.getVolume());
    }
}
