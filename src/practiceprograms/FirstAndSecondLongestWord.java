package practiceprograms;

import java.util.Scanner;

public class FirstAndSecondLongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Variables to store the first and second longest words
        String firstLongest = "";
        String secondLongest = "";

        // Iterate through the words to find the longest and second longest
        for (String word : words) {
            if (word.length() > firstLongest.length()) {
                secondLongest = firstLongest;
                firstLongest = word;
            } else if (word.length() > secondLongest.length() && !word.equals(firstLongest)) {
                secondLongest = word;
            }
        }

        // Output: Display the first and second longest words
        System.out.println("First longest word: " + firstLongest);
        System.out.println("Second longest word: " + secondLongest);

        scanner.close();
    }
}
