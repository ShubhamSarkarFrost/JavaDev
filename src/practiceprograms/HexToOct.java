package practiceprograms;

import java.util.Scanner;

public class HexToOct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Prompt the user to enter a hexadecimal number
        System.out.print("Enter a hexadecimal number: ");
        String hexadecimalNumber = scanner.nextLine();

        // Step 1: Convert the hexadecimal number to a decimal number
        int decimalNumber = Integer.parseInt(hexadecimalNumber, 16);

        // Step 2: Convert the decimal number to an octal number
        String octalNumber = Integer.toOctalString(decimalNumber);

        // Output: Display the octal number
        System.out.println("The octal equivalent of " + hexadecimalNumber + " is " + octalNumber);

        scanner.close();
    }
}
