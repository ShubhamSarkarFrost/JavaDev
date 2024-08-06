package arraycoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class maximumElementProduct {
    public static void main(String[]Args) throws IOException {

        int number, i;

        System.out.println("Please Enter the Number of elements to Enter in the Array :");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        number = Integer.parseInt(br.readLine());
        int[] arr = new int[number];

        System.out.println("Please Enter the Elements:");
        for (i = 0; i < number; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        maxEleProduct(arr);
    }

    private static void maxEleProduct(int[] arr) {

        int i, j, maxProduct,max_i, max_j;

        maxProduct = Integer.MAX_VALUE;
        max_i = -1;
        max_j = -1;

        for(i=0; i<arr.length ; i++){
            for (j=i+1; j<arr.length; j++){
                if(maxProduct < arr[i] * arr[j]){
                    maxProduct = arr[i] * arr[j];
                    max_i = arr[i];
                    max_j = arr[j];
                }
            }
        }
        System.out.print("Pair is (" + arr[max_i] + ", " + arr[max_j] + "), Maximum Product: " + (arr[max_i] * arr[max_j]));

    }
}
