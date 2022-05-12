import java.io.IOException;
import java.util.Scanner;

public class Min_Max_Challenge {

    public static void main(String[]Args) throws IOException{

        Scanner sc = new Scanner(System.in);
        int min, max;
//        min = 0 ; max = 0;
        // another way to fix the bug
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        boolean first = true;

        while(true){
            System.out.println("Enter a Number");
            boolean isAnInt = sc.hasNextInt();

            if(isAnInt){
                int number = sc.nextInt();
            // one way to fix the bug
//                if(first){
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if(number >max){
                    max = number;
                }
                if(number <min){
                    min = number;
                }
            }else{
                break;
            }
            sc.nextLine();
        }
        System.out.println("min= " + min + "max= " +max);
        sc.close();
    }
}
