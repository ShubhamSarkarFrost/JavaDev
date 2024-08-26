package practiceprograms;

import java.util.Scanner;

public class DecToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Conversion: Convert the decimal number to an octal number
        String octalNumber = Integer.toOctalString(decimalNumber);

        // Output: Display the octal number
        System.out.println("The octal equivalent of " + decimalNumber + " is " + octalNumber);

        scanner.close();
    }
}
