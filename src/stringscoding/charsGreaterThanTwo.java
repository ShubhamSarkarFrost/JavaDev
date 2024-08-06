package stringscoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class charsGreaterThanTwo {

    public static void main(String[]Args) throws IOException {
        String sentence;

        System.out.println("Please Enter the Sentence  :");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        sentence = br.readLine();
        System.out.println(morethantwotimes(sentence));


    }

    private static int morethantwotimes(String sentence) {


        int ctr = 0;

        if(sentence.length() > 0){
            if(sentence.length() - sentence.replaceAll(sentence.charAt(0)+"", "").length() > 2){
                ctr++;
            }
            sentence = sentence.replaceAll(sentence.charAt(0)+"","");
        }
        return ctr;
    }
}
