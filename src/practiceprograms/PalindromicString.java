package practiceprograms;

import java.io.IOException;
import java.util.Scanner;

public class PalindromicString {

    public static void main(String[] Args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Input: Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        boolean isPalindrome = checkPalindrome(sentence);
        if (isPalindrome) {
            System.out.println(sentence + " is a palindrome.");
        } else {
            System.out.println(sentence + " is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String str){
        int left = 0;
        int right = str.length() -1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return  false;
            }
            left++;
            right--;
        }
       return true;
    }
}
