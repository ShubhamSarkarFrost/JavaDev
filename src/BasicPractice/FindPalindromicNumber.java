package BasicPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindPalindromicNumber {

    public static void main(String[]Args) throws IOException {

        int num, reverseNumber, originalNumber, digit;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter a Number");
        num = Integer.parseInt(br.readLine());
        originalNumber = num;
        reverseNumber = 0;

        while(num >0){
            digit = num % 10;
            reverseNumber = reverseNumber * 10 + digit;
            num = num / 10;
        }

        if(originalNumber == reverseNumber){
            System.out.println("The Number is a  palindromic Number"+ num);
        }else{
            System.out.println("The Number is not a plaindromic Number"+ num);
        }

    }
}
