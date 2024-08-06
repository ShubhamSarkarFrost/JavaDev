package stringscoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveWordReturnSentence {

    public static void main(String[]Args) throws IOException {
        String sentence , removeword;

        System.out.println("Please Enter the Sentence  :");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        sentence = br.readLine();

        System.out.println("Please Enter the word to replace");

        removeword = br.readLine();

        sentenceremoveword(sentence,removeword);


    }

    private static void sentenceremoveword(String sentence, String removeword) {

        String[] wordsinSentence = sentence.split("\\s+");
        StringBuffer newword = new StringBuffer();

        for(String word : wordsinSentence){
            if(!word.equals(removeword)){
                newword = newword.append(word).append("");
            }
        }

        // Removing the trailing space
        if (newword.length() > 0) {
            newword.deleteCharAt(newword.length() - 1);
        }

        System.out.println("The New Sentence is :"+ newword.toString());

    }


}
