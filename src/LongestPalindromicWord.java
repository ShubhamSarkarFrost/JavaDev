import java.io.IOException;
import java.util.Scanner;

public class LongestPalindromicWord {

    public static void main(String[]Args) throws IOException {

        String sen;
        System.out.println("Please Enter the string of characters you want");
        Scanner sc = new Scanner(System.in);
        sen = sc.nextLine();
        System.out.println("Longest Palindromic word is :"+ findLongestPalindromic(sen));
    }
    public static String findLongestPalindromic(String sentence){

        String[] words = sentence.split("\\s+");

        String longestPalindromic = "";
        for(String word : words){
            if(ispalindromic(word) && word.length() > longestPalindromic.length()){
                longestPalindromic = word;
            }
        }
        return  longestPalindromic;
    }

    public static boolean ispalindromic(String word){
        int left = 0;
        int right = word.length() -1;

        while (left < right){
            if(Character.toLowerCase(word.charAt(left)) != Character.toLowerCase(word.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return  true;
    }
}
