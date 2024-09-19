package IBMPracticeQuestions;

import java.util.Scanner;

public class Palindromic_Number {

    public static void main(String[]Args){
        try(Scanner sc = new Scanner(System.in)){
            int number = sc.nextInt();

            //check whether the number is palindromic number or not
            if(checkPalindromicNumber(number)){
                System.out.println("The Number is a palindromic number :"+ number);
            }else {
                System.out.println("The Number is not a palindromic number :"+ number);
            }

        }catch(Exception e){
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        }
    }

    private static boolean checkPalindromicNumber(int number) {
        String int_string = Integer.toString(number);
        int left = 0;
        int right = int_string.length() - 1;

        while(left < right){
            if(int_string.charAt(left) != int_string.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return  true;
    }


}
