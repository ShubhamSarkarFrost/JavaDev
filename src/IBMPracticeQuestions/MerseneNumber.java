package IBMPracticeQuestions;

import java.io.IOException;
import java.util.Scanner;

public class MerseneNumber {

    public static void main(String[]Args) throws IOException {

        try (Scanner scanner = new Scanner(System.in)) {
            // Input the number to check
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Check if the number is a Mersenne number
            if (isMersenneNumber(number)) {
                System.out.println(number + " is a Mersenne number.");
            } else {
                System.out.println(number + " is not a Mersenne number.");
            }

        } catch (Exception e) {
            // Handle any input errors
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        }
        // Close the scanner
    }

    private static boolean isMersenneNumber(int number) {
        if(number < 1){
            return false;
        }

        // Check for powers of 2 and subtract 1 to see if it matches the number
        int powerOfTwo = 1;

        while (powerOfTwo - 1 < number){
            if(powerOfTwo - 1 == number){
                return true;
            }
            powerOfTwo *= 2;
        }
        return false;
    }
}
