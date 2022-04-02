import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaCalculator {



    public static void main(String[] args) throws IOException{

        double radius;
        int length, breadth , choice;
        System.out.println("Welcome to Area Calculator Program : )");
        System.out.println("Choose 1 - Area of Circle & 2- Area of Rectangle");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        choice =  Integer.parseInt(br.readLine());
        if( choice == 1){
            System.out.println("Enter the value of Radius");
            radius = Double.parseDouble(br.readLine());
            System.out.println(" Area of Circle is "+ Area(radius));
        }
        else{
            System.out.println("Enter the value of length");
            length =Integer.parseInt(br.readLine());
            System.out.println("Enter the value of Breadth");
            breadth = Integer.parseInt(br.readLine());
            System.out.println(" Area of rectangle is "+ Area(length * breadth));
        }


    }

    private static double Area(double radius){
        double pi = 3.14;

        if(radius < 0){
            return -1;
        }
        return pi *(radius * radius);
    }

    private static int Area(int length, int breadth){

        if((length < 0) || (breadth < 0)){
            return -1;
        }
        return length * breadth;
    }
}
