package practiceprograms;

import java.util.Scanner;

public class MaxFrequencyWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        //Split the sentence
        String[] words = sentence.toLowerCase().split("//s+");

        String maxFrequencyWord = "";
        int maxFreq = 0;

        // Iterate through each element in the array
        for(int i = 0 ; i< words.length; i++){
            int count = 1;

            // compare the current element with each element in the array
            for(int j = i +1 ; j< words.length; j++){
                if(words[i].equals(words[j])){
                    count++;
                }
            }

            //update maxFreq and maxFrequencyWord
            if(count > maxFreq){
                count = maxFreq;
                maxFrequencyWord = words[i];
            }
        }

        if(maxFreq > 1){
            System.out.println("The word with the maximum frequency is: '" + maxFrequencyWord + "' with a frequency of " + maxFreq);
        }else {
            System.out.println("No word repeats more than once.");
        }

        }
}
