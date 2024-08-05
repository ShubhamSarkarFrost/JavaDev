package arraycoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class duplicates_array {

    public static void findDuplicates(int[] array) {
        int n = array.length;

        // Sort the array first
        java.util.Arrays.sort(array);

        // Loop through the sorted array and find duplicates
        for (int i = 0; i < n - 1; i++) {
            if (array[i] == array[i + 1]) {
                System.out.print(array[i] + " ");

                // Skip all adjacent duplicates
                while (i < n - 1 && array[i] == array[i + 1]) {
                    i++;
                }
            }
        }
    }

    public static void main(String[]Args) throws IOException {

        int number, i;

        System.out.println("Please Enter the Number of elements to Enter in the Array :");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        number = Integer.parseInt(br.readLine());
        int[]arr = new int[number];

        System.out.println("Please Enter the Elements:");
        for(i=0; i<number; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Duplicate elements are:");
       findDuplicates(arr);




    }
}
