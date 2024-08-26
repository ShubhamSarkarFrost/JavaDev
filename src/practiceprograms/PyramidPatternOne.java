package practiceprograms;

import java.io.IOException;
import java.util.Scanner;

public class PyramidPatternOne {

    public static void main(String[]Args) throws IOException {
        System.out.print("Enter the number of rows for the pyramid to build: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i, j, k;

        for(i = 0 ; i<=n; i++){
            for(j = n; j >i; j--){
                System.out.println(" ");
            }

            for(k=i ; k<=n; k++){
                System.out.println(i+" ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
