package arraycoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class secondLargest_array {

    private static void secondLargest(int[]Array){
        if(Array.length < 1){
            System.out.println("There is no second largest element");
        }

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int arr : Array){
            if(arr > largest){
                secondlargest = largest;
                largest = arr;
            } else if (arr > secondlargest && arr !=largest) {
                secondlargest = arr;
            }

        }
        System.out.println("The Second Largest Element is :"+secondlargest);
    }

    private static void secondSmallest(int[]Array){
        if(Array.length < 2){
            System.out.println("There is no second Smallest element");
        }

        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for(int arr : Array){
            if(arr < smallest){
                secondsmallest = smallest;
                smallest = arr;
            } else if (arr > secondsmallest && arr !=smallest) {
                secondsmallest = arr;
            }

        }
        System.out.println("The Second smallest Element is :"+secondsmallest);
    }

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

        secondLargest(arr);
        secondSmallest(arr);
    }


}
