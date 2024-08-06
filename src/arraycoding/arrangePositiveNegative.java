package arraycoding;

import java.io.IOException;

public class arrangePositiveNegative {

    public static void main(String[] args) throws IOException {
        int[] array = {0, 1, 0, 1, 1, 0, 0, 1};
        movepositivesandnegatives(array);
        System.out.println("Array after separation:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private static void movepositivesandnegatives(int[] array) {

        int left = 0;
        int right = array.length -1;


        while (left < array.length && array[left] >= 0) {
            left++;
        }

        // Move right pointer until a positive number is found
        while (right >= 0 && array[right] < 0) {
            right--;
        }

        // Swap the negative number at left with the positive number at right
        if (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
