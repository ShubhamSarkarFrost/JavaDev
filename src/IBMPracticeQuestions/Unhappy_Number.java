package IBMPracticeQuestions;
import java.util.Scanner;

public class Unhappy_Number {

    // Function to check if a number is a Disarium number
    public static boolean isDisarium(int number) {
        int sum = 0, temp = number;
        int length = String.valueOf(number).length();

        // Calculate the sum of digits powered with their respective positions
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            length--;
            temp /= 10;
        }
        return sum == number;
    }

    // Function to check if a number is an Unhappy (or Sad) number
    public static boolean isUnhappy(int number) {
        int slow = number, fast = number;

        // Floyd's Cycle detection algorithm to detect loop
        do {
            slow = squareOfDigits(slow);
            fast = squareOfDigits(squareOfDigits(fast));
        } while (slow != fast);

        return slow != 1;
    }

    // Helper function to calculate the sum of the squares of digits of a number
    public static int squareOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is Disarium
        if (isDisarium(number)) {
            System.out.println(number + " is a Disarium number.");
        } else {
            System.out.println(number + " is not a Disarium number.");
        }

        // Check if the number is Unhappy
        if (isUnhappy(number)) {
            System.out.println(number + " is an Unhappy (Sad) number.");
        } else {
            System.out.println(number + " is a Happy number.");
        }

        scanner.close();
    }

}
