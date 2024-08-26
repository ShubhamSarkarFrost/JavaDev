package practiceprograms;

import java.util.Scanner;

public class HexToDec {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Prompt the user to enter a hexadecimal number
        System.out.print("Enter a hexadecimal number: ");
        String hexadecimalNumber = scanner.nextLine();

        // Conversion: Convert the hexadecimal number to a decimal number
        int decimalNumber = Integer.parseInt(hexadecimalNumber, 16);

        // Output: Display the decimal number
        System.out.println("The decimal equivalent of " + hexadecimalNumber + " is " + decimalNumber);

        scanner.close();
    }
}
