package stringscoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class duplicatesWordsInSentence {

    public static void main(String[] args) throws  IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a sentence:");
        String input = reader.readLine();

        findDuplicateWords(input);
        findduplicatewords(input);
    }

    private static void findDuplicateWords(String input) {
        String[] words = input.toLowerCase().split("\\s+");
        // create a new Hashmap
        Map<String,Integer> wordcount = new HashMap<>();
        //enter the words in the hashmap
        for(String word : words){
            wordcount.put(word, wordcount.getOrDefault(word,0)+1);
        }
        System.out.println("Duplicate words:");
        for (Map.Entry<String, Integer> entry : wordcount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }

    private static void findduplicatewords(String input){
        String[] NewWord = input.toLowerCase().split("\\s");
        Arrays.sort(NewWord);
        int length = NewWord.length;

        for(int i=0 ; i < length ; i++){
            int count = 1;
            while (i < length -1 && NewWord[i].equals(NewWord[i+1])){
                count++;
                i++;
            }

            if(count > 1){
                System.out.println(NewWord[i] + ": " + count + " times");
            }
        }


    }
}
