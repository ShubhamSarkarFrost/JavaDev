package Collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxMinList {

    public static void main(String[]Args) throws IOException {

        int i, noOfElements ;
        List<String> l_list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements in The List");
        noOfElements = sc.nextInt();
        System.out.println("Enter the Elements in the List");
        for(i=0; i<noOfElements; i++){
            l_list.add(sc.next());
        }
        System.out.println("Elements in the List are :"+l_list);

        // Initialize variables to store the max and min word count strings
        String maxWordsString = null;
        String minWordsString = null;
        int maxWords = 0;
        int minWords = Integer.MAX_VALUE;

        for(String str : l_list){

            String[] words = str.split("\\s+");
            int wordCount = words.length;
            if(wordCount > maxWords){
                maxWords = wordCount;
                maxWordsString = str;

            }

            if(wordCount <minWords){
                minWords = wordCount;
                minWordsString = str;
            }
        }

        // Print the results
        System.out.println("String with maximum words: \"" + maxWordsString + "\" (" + maxWords + " words)");
        System.out.println("String with minimum words: \"" + minWordsString + "\" (" + minWords + " words)");

    }
}
