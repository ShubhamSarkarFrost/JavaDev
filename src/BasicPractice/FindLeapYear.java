package BasicPractice;

import java.io.IOException;
import java.util.Scanner;


public class FindLeapYear {

    public static void main(String[] Args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int year;
        String choice;

        do {
            System.out.println("Please Enter a Year");
            year = scanner.nextInt();

            if(((year % 4 == 0) && (year % 100 != 0)) ||
                    (year % 400 == 0)){
                System.out.println("Its a Leap Year :"+ year);
            }else{
                System.out.println("Not a Leap Year :"+ year);
            }

            // Ask the user if they want to continue
            System.out.print("Do you want to check another year? (yes/no): ");
            choice = scanner.next().toLowerCase(); // Convert input to lowercase for easier comparison

        } while (choice.equals("yes"));

        System.out.println("Program ended.");
        scanner.close();
    }
}
