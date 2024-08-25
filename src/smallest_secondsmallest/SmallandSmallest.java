package smallest_secondsmallest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SmallandSmallest {

    public static void main(String[] Args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number of Elements in the Array");
        int elem = sc.nextInt();

        if (elem < 2) {
            System.out.println("The Array should have at least 2 elements");
            return;
        }

        int[] arr = new int[elem];
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondsmallest && arr[i] != smallest) {
                secondsmallest = arr[i];
            }
        }

        if (secondsmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element.");
        } else {
            System.out.println("Smallest element: " + smallest);
            System.out.println("Second smallest element: " + secondsmallest);
        }

        sc.close();

    }


}
