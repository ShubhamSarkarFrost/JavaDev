package Arrays_Basic;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ProductOfMaximumInteger {

    public static void main(String[]Args) throws IOException, IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number of Elements in the Array");
        int elem = sc.nextInt();

        int[] arr = new int[elem];
        int maxProduct = ProductOfMaxInteger(arr);
        System.out.println("The maximum product of two integers in the array is: " + maxProduct);
    }

    private static int ProductOfMaxInteger(int[] arr) throws IllegalAccessException {
        if (arr.length < 2) {
            throw new IllegalAccessException("The Array should contain minimum of two elements");
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        return Math.max(max1 * max2 , min1 * min2);
    }
}

