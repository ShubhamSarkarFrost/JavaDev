package IBMPracticeQuestions;

import java.util.Scanner;

public class CyclicNumber {
    // Function to check if two numbers are cyclic permutations of each other
    public static boolean areCyclicPermutations(String num1, String num2) {
        if (num1.length() != num2.length()) {
            return false;
        }

        // Concatenate the original number to check cyclic permutations
        String concatenated = num1 + num1;
        return concatenated.contains(num2);
    }

    // Function to check if a number is cyclic
    public static boolean isCyclic(int number) {
        String originalNumber = Integer.toString(number);
        int length = originalNumber.length();

        // Check all multiples of the number (from 1 to the length of the number)
        for (int i = 1; i <= length; i++) {
            int multiplied = number * i;
            String multipliedNumber = Integer.toString(multiplied);

            // If the multiplied number is not a cyclic permutation, return false
            if (!areCyclicPermutations(originalNumber, multipliedNumber)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Input the number to check
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Check if the number is cyclic
            if (isCyclic(number)) {
                System.out.println(number + " is a cyclic number.");
            } else {
                System.out.println(number + " is not a cyclic number.");
            }

        } catch (Exception e) {
            // Handle any input errors
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        }
        // Close the scanner
    }
}
