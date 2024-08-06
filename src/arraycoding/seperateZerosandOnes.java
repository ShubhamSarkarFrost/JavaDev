package arraycoding;
import java.io.IOException;


public class seperateZerosandOnes {
    public static void main(String[] args) throws IOException {
        int[] array = {0, 1, 0, 1, 1, 0, 0, 1};
        moveZerosandOnes(array);
        System.out.println("Array after separation:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private static void moveZerosandOnes(int[] array) {

        int left =0 ;
        int right = array.length -1 ;

        while(left < right){
            //move the element to left if the element is zero
            while (array[left] == 0 && left < right){
                left ++;
            }
            //move the element to right if the element is one
            while (array[right] == 1 && left < right) {
                right--;

            }
            // swap the element
            if(left < right){
               array[left] = 0;
               array[right] = 1;
               left++;
               right--;
            }
        }
    }
}
