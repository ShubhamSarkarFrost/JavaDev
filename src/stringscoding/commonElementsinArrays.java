package stringscoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class commonElementsinArrays {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a sentence:");
        String input = reader.readLine();
        System.out.println("Enter a match sentence:");
        String input_new = reader.readLine();
    }

    private static void commonelements(String sen, String matchsen){
        String[] sen_words = sen.toLowerCase().split("\\s+");
        String[] matchsen_words = sen.toLowerCase().split("\\s+");

        Set<String> setone = new HashSet<>();
        Set<String> commonElements = new HashSet<>();

        for(String word : sen_words){
            setone.add(word);
        }

        for(String word : matchsen_words){
            if(setone.contains(word)){
                commonElements.add(word);
            }
        }
        System.out.println("Common elements: " + commonElements);
    }
}
