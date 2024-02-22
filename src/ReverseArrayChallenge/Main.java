package ReverseArrayChallenge;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[]Args) throws IOException {
       int[] numElements = readElements();
       reverseArray(numElements);
    }

    public static int[] readElements(){

        System.out.println("Please Enter the List of Numbers Followed by Commas");
        String numbers = sc.nextLine();
        String[] splits = numbers.split(",");
        int [] values = new int[splits.length];
        for(int i=0; i<splits.length; i++){
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return  values;
    }

    public static void reverseArray(int[] array){
        int [] reverseArray = new int[array.length];
        for(int rev = 0 ; rev < array.length; rev++){
            reverseArray[rev] = array[array.length -rev -1];
        }

        System.out.println("Reverse Array is:");
        for(int el : reverseArray){
            System.out.println(el);
        }

    }


}
