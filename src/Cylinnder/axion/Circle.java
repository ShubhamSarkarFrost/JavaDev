package Cylinnder.axion;
import java. lang. Math. *;
public class Circle {

    public double radius ;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        if(radius == 0.0)
        return 0;
        else
            return radius;
    }

    public double getArea(){
        if(radius < 0.0)
            return 0;
        else
        return radius * radius *Math.PI;
    }
}
