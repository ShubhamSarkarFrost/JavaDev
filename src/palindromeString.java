import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class palindromeString {

    public static boolean palindromeCheck(String sen){

        sen = sen.toLowerCase();

        int left = 0;
        int right = sen.length() -1;

        while(left < right){
            if(sen.charAt(left) != sen.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }

    public static void main(String[]Args) throws IOException {

        String word;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word to check palindromic or not");
        word = sc.nextLine();
        boolean result = palindromeCheck(word);

        if(result == true){
            System.out.println("It is a Palindromic word");
        }else {
            System.out.println("It is not a palindromic word");
        }
    }
}
