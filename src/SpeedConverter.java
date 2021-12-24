import java.io.IOException;
import java.util.Scanner;

public class SpeedConverter {

    public static long milesperhour(double kilometresperhour){
        if(kilometresperhour < 0){
            return -1;
        }
        return Math.round(kilometresperhour/1.609);
    }

    public static void PrintConversion(double kilometresperhour){
        if(kilometresperhour <0){
            System.out.println("Invalid kilometresperhour "+kilometresperhour);
        }else{
            long mph = milesperhour(kilometresperhour);
            System.out.println("The Entered KM/H is : "+kilometresperhour +"is Equal to "+mph+" Miles Per Hour");
        }

    }

    public static void main(String[] args) throws IOException{
        double speed;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Speed Conversion Program , Please Enter the Speed in Miles per Hour");
        speed = sc.nextDouble();
        PrintConversion(speed);
    }
}
