package Arrays_Basic;

import java.util.Scanner;

public class Main {
    private static int count;
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
//        int[] myvar = new int[10];
//     // this is a basic array function
//     for(int i = 0 ; i < 10; i++){
//         myvar[i] = i * 10;
//     }
//     //basic retrival
//     for(int i = 0 ; i< myvar.length; i++){
//         System.out.println("the value of element at "+i+"is "+myvar[i]);
//     }
        int[] myIntegers = getIntegers(5);
        for(count = 0; count<myIntegers.length; count++){
            System.out.println("Value of the array at Index "+count+" is "+myIntegers[count]);
        }


    }

    private static int[] getIntegers(int i) {

        System.out.println("Enter "+ i +" Integer Values \r");
        int values[] = new int[i];
        for( count = 0; count<values.length; count++){
            values[count] = sc.nextInt();
        }
        return values;
    }
}
