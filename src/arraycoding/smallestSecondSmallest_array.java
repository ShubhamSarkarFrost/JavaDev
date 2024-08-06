package arraycoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class smallestSecondSmallest_array {

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

        System.out.println("---------------------------With Integer MAX Value -----------------------------");
        secondSmallest(arr);
        System.out.println("---------------------------With Indexing -----------------------------");
        findSmallestAndSecondSmallest(arr);
    }

    private static void secondSmallest(int[] arr) {

        //check Array length is greater than one
        if(arr.length < 2){
            System.out.println("There is no second element");
        }

        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for(int number : arr){
            if(number < smallest){
                secondsmallest = smallest;
                smallest = number;
            } else if (number <secondsmallest && number!= smallest) {
                secondsmallest = number;

            }
        }
        System.out.println("Smallest Element is :"+smallest);
        System.out.println("The Second smallest Element is :"+secondsmallest);
    }

    public static void findSmallestAndSecondSmallest(int[] array) {

        //check Array length is greater than one
        if(array.length < 2){
            System.out.println("There is no second element");
        }

        int first, second;

        //initializing the default min and second min value for elements
        if(array[0] < array[1]){
            first = array[0];
            second = array[1];
        }else {
            first = array[1];
            second = array[0];
        }

        for(int i = 2 ; i< array.length; i++){
            if(array[i] < first){
                second = first;
                first = array[i];
            } else if (array[i] < second && array[i] != first) {
                second = array[i];
            }
        }
        System.out.println("Smallest Element is :"+first);
        System.out.println("The Second smallest Element is :"+second);
    }
}
