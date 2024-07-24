package Recursion;

import java.io.IOException;
import java.util.Scanner;

public class PalindromicRecursive {

    public static boolean isPalindromic(String word){

        if(word.length() <= 1){
            return true;
        }

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);

        if(firstChar != lastChar){
            return false;
        }

        String remainingSubstring = word.substring(1,word.length() -1);
        return isPalindromic(remainingSubstring);
    }

    public static void main(String[]Args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to check palindromic or not");
        String text = sc.nextLine();

        boolean checkPalindromic = isPalindromic(text);
        if(checkPalindromic){
            System.out.println("is a Palindromic word");
        }else {
            System.out.println("Not a Palindromic word");
        }
    }
}
