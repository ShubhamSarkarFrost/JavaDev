package Arrays_Basic;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class OddRightEvenLeft {

    public static void main(String[]Args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number of Elements in the Array");
        int elem = sc.nextInt();

        int[] arr = new int[elem];
        arrangeoddeven(arr);
        System.out.println("Array after moving zeros to the end: " + Arrays.toString(arr));
    }

    private static void arrangeoddeven(int[] arr) {
        int left = 0;
        int right = arr.length -1 ;

        while(left < right){
            if(arr[left] % 2 == 0){
                left++;
            }
            else if(arr[right] % 2 !=0){
                right++;
            }
            else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
