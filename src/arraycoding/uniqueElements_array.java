package arraycoding;

import java.util.Arrays;

public class uniqueElements_array {

    public static void main(String[] args) {
        int[] array = {3, 6, 3, 9, 2, 6, 5, 9, 1};

        int newLength = removeDuplicates(array);

        System.out.println("Length of the updated array: " + newLength);
        System.out.println("Updated array:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static int removeDuplicates(int[] array) {

        if(array.length == 0){
            return 0;
        }

        Arrays.sort(array);

        int index = 1;
        for(int i = 1; i< array.length ; i++){
            if(array[i-1] == array[i]){
                array[index++] = array[i];
            }
        }

        return index;
    }

}
