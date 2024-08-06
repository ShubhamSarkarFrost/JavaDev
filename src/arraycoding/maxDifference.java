package arraycoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class maxDifference {

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

        maxDiff(arr);
    }

    private static void maxDiff(int[] arr) {

        int i , j , diff, maxDifference;

        maxDifference = Integer.MIN_VALUE;


        if(arr.length < 1){
            System.out.println("Maximum Difference is :"+ arr[0]);
        }else{
            for(i = 0 ; i< arr.length; i++){
                for(j=i+1; j<arr.length; j++){
                    diff = arr[j] - arr[i];
                    if(diff > maxDifference){
                        maxDifference = diff;
                    }
                }
            }
            System.out.print("Maximum difference between two elements are :"+maxDifference);
        }




    }
}
