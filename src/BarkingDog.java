import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BarkingDog {

    public static String getTime(){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public static void main(String[] args) throws IOException{

        int dogbarks;
        System.out.println("Welcome to Is Your Dog Barking Program !\n");
        System.out.println("Is Your Dog Barking Enter 1-true & 2 -False");
        Scanner sc = new Scanner(System.in);
        dogbarks = sc.nextInt();
        if(dogbarks == 1){
            System.out.println("Your Dog is Barking at "+ getTime() + " hrs");
        }else{
            System.out.println("Your Dog is Not Braking");
        }

    }
}
