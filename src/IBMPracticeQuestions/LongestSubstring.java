package IBMPracticeQuestions;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstring {

    public static  int longestSubstring(String sen){
        HashSet<Character> set = new HashSet<>();

        //initiate left pointer and maxlength
        int left = 0;
        int maxlength = 0;

        // run the loop from start till the end
        for(int right = 0; right<sen.length(); right++){
            char curChar = sen.charAt(right);

            // check whether the set contains the current character
            while(set.contains(curChar)){
                set.remove(sen.charAt(left));
                left++;
            }
           // if current character is not present then add it
            set.add(curChar);
            maxlength = Math.max(maxlength, right - left +1);
        }
        return maxlength;
    }

    public static void main(String[]Args) throws IOException {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please Enter a Sentence to Check Longest Substring");
            String sen = scanner.nextLine();
            int longestSub = longestSubstring(sen);
            System.out.println("The Longest Substring is :"+longestSub);
        }
        catch (Exception e){
            System.out.println("No Valid Sentence has been entered");
        }
    }
}
