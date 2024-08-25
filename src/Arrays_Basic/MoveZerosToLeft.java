package Arrays_Basic;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToLeft {

    public static void main(String[]Args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number of Elements in the Array");
        int elem = sc.nextInt();

        int[] arr = new int[elem];
        movezerostoleft(arr);
        System.out.println("Array after moving zeros to the end: " + Arrays.toString(arr));
    }

    private static void movezerostoleft(int[] arr) {
        int n = arr.length;
        int index = 0;

        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index ++;
            }
        }

        while(index < n){
            arr[index] = 0;
            index++;
        }

    }
}
