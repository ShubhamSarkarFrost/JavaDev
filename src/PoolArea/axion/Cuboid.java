package PoolArea.axion;

public class Cuboid extends Rectangle{

    public double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public double getHeight(){
        if(height <0.0){
            return 0;
        }else{
            return height;
        }

    }

    public double getVolume(){
        if(getLength() < 0.0 && getWidth() <0.0 && height <0.0){
            return 0;
        }else{
            return getLength()*getWidth()*height;
        }
    }
}
