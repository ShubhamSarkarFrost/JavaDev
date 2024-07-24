package Recursion;

import java.io.IOException;
import java.util.Scanner;

public class RecursiveFactorial {

    public static int calculatefactorial(int n){
        //Base Case
        if(n==0){
            return 1;
        }else{
            return n * calculatefactorial(n-1);
        }
    }

    public static void main(String[]Args) throws IOException {

        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Whole Number:");
        number = sc.nextInt();
        System.out.println("Factorial of the Number entered is: "+calculatefactorial(number));
    }
}
