package arraycoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoveallZeroElements {

    public static void main(String[] args) throws IOException {
        int number, i;

        System.out.println("Please Enter the Number of elements to Enter in the Array :");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        number = Integer.parseInt(br.readLine());
        int[] array = new int[number];

        System.out.println("Please Enter the Elements:");
        for (i = 0; i < number; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        moveZerosToEnd(array);

        System.out.println("Array after moving zeros to the end:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private static void moveZerosToEnd(int[] array) {

        int n = array.length;
        int index = 0;

        //move all the numbers in the front of an array
        for(int i = 0 ; i< n ; i++){
            if(array[i] != 0) {
                array[index++] = array[i];
            }
        }

        //move all the zero elements at the back
        while (index < n){
            array[index++] = 0;
        }
    }
}
