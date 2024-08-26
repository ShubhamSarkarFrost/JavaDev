package practiceprograms;

import java.io.IOException;
import java.util.Scanner;

public class MaxFrequencyCharacter {

    public static void main(String[]Args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Input: Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to lowercase to handle case-insensitivity
        String str = input.toLowerCase();

        //Array to Store Max Frequency of Each Charcter
        int[]freq = new int[256];

        // Calculate the frequency of each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Find the character with the maximum frequency
        char maxFreqChar = ' ';
        int maxFreq = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                maxFreqChar = ch;
            }
        }

        // Output: Display the character with the maximum frequency
        System.out.println("The character with the maximum frequency is: '" + maxFreqChar + "' with a frequency of " + maxFreq);

        scanner.close();
    }
}
