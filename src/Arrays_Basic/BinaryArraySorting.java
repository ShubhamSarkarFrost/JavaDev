package Arrays_Basic;

import java.util.Arrays;

public class BinaryArraySorting {
    public static void sortBinaryArray(int[] arr) {
        int left = 0; // Pointer for the left side of the array
        int right = arr.length - 1; // Pointer for the right side of the array

        while (left < right) {
            // Move the left pointer to the right as long as it points to 0
            if (arr[left] == 0) {
                left++;
            }
            // Move the right pointer to the left as long as it points to 1
            else if (arr[right] == 1) {
                right--;
            }
            // If left points to 1 and right points to 0, swap them
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 0, 1, 0};
        System.out.println("Original array: " + Arrays.toString(arr));

        sortBinaryArray(arr);
        System.out.println("Sorted binary array: " + Arrays.toString(arr));
    }
}
