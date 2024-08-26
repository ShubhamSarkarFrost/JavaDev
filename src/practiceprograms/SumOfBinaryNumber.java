package practiceprograms;

import java.io.IOException;
import java.util.Scanner;

public class SumOfBinaryNumber {

    public static void main(String[]Args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Input two binary numbers as strings
        System.out.print("Enter the first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.print("Enter the second binary number: ");
        String binary2 = scanner.nextLine();

        // Convert binary strings to integers
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        // Add the two integers
        int sum = num1 + num2;

        // Convert the sum back to a binary string
        String binarySum = Integer.toBinaryString(sum);

        // Output the result
        System.out.println("Sum of the two binary numbers: " + binarySum);

        scanner.close();
    }
}
