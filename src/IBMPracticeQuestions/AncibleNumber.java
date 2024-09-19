package IBMPracticeQuestions;

import java.io.IOException;
import java.util.Scanner;

public class AncibleNumber {

    // calculate the sum of proper divisors
    public static int sumOfDivisors(int number){
        int sum = 0;
        for(int i = 0 ; i< number / 2 ; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        return  sum;
    }

    public static boolean areAmicable(int numOne, int numTwo){
        return sumOfDivisors(numOne) == numTwo && sumOfDivisors(numTwo) == numOne;
    }

    public static void main(String[]Args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input two numbers
            System.out.print("Enter first number: ");
            int number1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int number2 = scanner.nextInt();

            // Check if the numbers are Amicable
            if (areAmicable(number1, number2)) {
                System.out.println(number1 + " and " + number2 + " are Amicable numbers.");
            } else {
                System.out.println(number1 + " and " + number2 + " are not Amicable numbers.");
            }

        } catch (Exception e) {
            // Handle any input or processing errors
            System.out.println("Error: Invalid input. Please enter valid integers.");
        } finally {
            // Close the scanner to prevent resource leaks
            scanner.close();
        }
    }
}
