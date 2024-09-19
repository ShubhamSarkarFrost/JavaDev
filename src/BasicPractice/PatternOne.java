package BasicPractice;

import java.io.IOException;
import java.util.Scanner;

public class PatternOne {

    /*
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
     */
    public static void main(String[]Args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the last number which you want to genearte pattern");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j=1; j <=i; j++ ){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
