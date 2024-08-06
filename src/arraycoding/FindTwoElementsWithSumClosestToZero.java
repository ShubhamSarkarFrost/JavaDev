package arraycoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindTwoElementsWithSumClosestToZero {

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
    }

    public static void findTwoElementsWithSumClosestToZero(int[]array){

        //sort the Array
        Arrays.sort(array);

        // define the moving logic
        int left = 0;
        int right = array.length - 1;
        int minSum = Integer.MAX_VALUE;
        int minleft = left;
        int minright = right;

        //traverse the array using two pointers
        while (left < right){
            int sum = array[left] + array[right];

            //update the resulty closer to zero
            if(Math.abs(sum) < Math.abs(minSum)){
                minSum = sum;
                minleft = left;
                minright = right;
            }

            // If the sum is less than zero, move the left pointer to the right
            if(sum < 0){
                left ++;
            }
            else{
                right --;
            }
        }

        System.out.println("The two elements whose sum is closest to zero are: " +
                array[minleft] + " and " + array[minright]);
    }
}
