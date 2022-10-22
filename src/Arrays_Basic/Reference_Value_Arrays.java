package Arrays_Basic;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Reference_Value_Arrays {
    public static void main(String[]args) throws IOException{
        //value type
        int myvalue, mynewvalue;
        myvalue  = 10;
        mynewvalue = myvalue;
        System.out.println("The Value of My Value is: "+myvalue+" The Value of my new Value is "+mynewvalue);
        mynewvalue++;
        System.out.println("The Value of My Value is: "+myvalue+" The Value of my new Value is "+mynewvalue);

        //reference type -> String and Arrays
        int[] myArray = new int[5];
        int[] mynewArray = myArray;

        System.out.println("My Array :"+ Arrays.toString(myArray)+"My new Array "+Arrays.toString(mynewArray));
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i< 5; i++){
            System.out.println("Please Enter 5 Elements in the Array:");
            myArray[i] = sc.nextInt();
        }
        System.out.println("My Array :"+ Arrays.toString(myArray)+"My new Array "+Arrays.toString(mynewArray));

        //logical output -> My Array :[1, 2, 3, 4, 5]My new Array [1, 2, 3, 4, 5]
    }
}
