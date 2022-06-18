package Cylinnder.axion;

public class Cylinder extends Circle{

    public double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        if(height <0.0)
            return 0;
        else
        return height;
    }

    public double getVolume(){
        if(height <0.0)
            return 0;
        else
            return getArea() * height;
    }
}
