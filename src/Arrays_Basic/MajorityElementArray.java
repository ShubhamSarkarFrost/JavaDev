package Arrays_Basic;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MajorityElementArray {

    public static void main(String[]Args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number of Elements in the Array");
        int elem = sc.nextInt();

        int[] arr = new int[elem];
        majorityElement(arr);
        System.out.println("Array after moving zeros to the end: " + Arrays.toString(arr));
    }

    private static void majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        // Phase 1: Find a candidate for majority element
        for(int num : nums){
            if(count == 0){
                candidate = num ;
            }
            count += (num == candidate) ? 1: -1;
        }

        // Phase 2- Verify the candidate for majority element
        count = 0;
        for(int num : nums){
            if(candidate == num){
                count++;
            }
        }

        //Phase 3 - check that the candidate is the majority element
        if(count > nums.length / 2){
            System.out.println("Majority Element Found "+ candidate);
        }else {
            throw new IllegalArgumentException("No majority element found");
        }

    }
}
