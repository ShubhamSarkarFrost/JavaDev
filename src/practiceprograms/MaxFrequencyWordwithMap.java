package practiceprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxFrequencyWordwithMap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Convert the sentence to lowercase and split it into words
        String[] words = sentence.toLowerCase().split("\\s+");

        Map<String, Integer> wordFreq = new HashMap<>();

        for(String word : words){
            wordFreq.put(word, wordFreq.getOrDefault(word, 0)+1);
        }

        //find the maximum Frequency
        String maxFreqWord = null;
        int maxFreq = 0;

        for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxFreqWord = entry.getKey();
            }
        }

        // Output: Display the word with the maximum frequency
        if (maxFreqWord != null) {
            System.out.println("The word with the maximum frequency is: '" + maxFreqWord + "' with a frequency of " + maxFreq);
        } else {
            System.out.println("No words found in the sentence.");
        }

        scanner.close();
    }
}
