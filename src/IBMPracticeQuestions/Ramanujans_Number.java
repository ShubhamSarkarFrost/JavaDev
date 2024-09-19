package IBMPracticeQuestions;

import java.util.Scanner;

public class Ramanujans_Number {

    public static void printRamanujansNumber(int num){
        for(int a = 1 ; a * a * a <= num ; a++){
            for(int b = a; a * a * a + b * b * b <= num ; b++ ){
                int sum_one = a * a * a + b * b * b;


            for(int c = a+1; c * c * c <= num; c++){
                for(int d = c ; c * c * c + d * d * d <= num; d++){
                    int sum_two = c * c * c + d * d * d;


                // If the sums match and are less than or equal to n, print the Ramanujan number
                if (sum_one == sum_two) {
                    System.out.println(sum_one + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                }
            }
            }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input the upper limit 'n' to find Ramanujan numbers
            System.out.print("Enter the value of n: ");
            int n = scanner.nextInt();

            // Find and print all Ramanujan numbers from 1 to n
            printRamanujansNumber(n);

        } catch (Exception e) {
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
