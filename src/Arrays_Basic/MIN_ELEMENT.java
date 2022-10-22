package Arrays_Basic;

import java.util.Scanner;

public class MIN_ELEMENT {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[]args) {
        int elem, minelem;
        int[] returnarray;
        System.out.println("Enter the no of Elements you want to enter in tha Array:");
        elem = sc.nextInt();
        returnarray = readIntegers(elem);
        minelem = returnminelem(returnarray);
        System.out.println("Minimum Element is :"+ minelem);
    }

    public static int[] readIntegers(int count){
        int[] arr = new int[count];
        System.out.println("Please Enter "+count+" elements");
        for(int i = 0; i<count; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int returnminelem(int[]arr){
        int min = Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }


}
