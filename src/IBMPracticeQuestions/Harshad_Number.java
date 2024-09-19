package IBMPracticeQuestions;

import java.io.IOException;
import java.util.Scanner;

public class Harshad_Number {

    public static void checkHarshadNumber(int number){
        int i,digits,original_num, sum;
        sum = 0;
        original_num = number;
        String numString = Integer.toString(number);
        int length = numString.length();
        for(i = 0 ; i< length; i++){
            digits = number % 10;
            sum += digits;
            number = number / 10;
        }
        if(original_num / sum == 0){
            System.out.println("Harshad Number :"+ number);
        }else{
            System.out.println("Not a Harshad Number :"+ number);
        }
    }

    public static void main(String[]Args) throws IOException {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        System.out.println("Please Enter a Number to Check Harshad Number");
        checkHarshadNumber(number);
    }
}
