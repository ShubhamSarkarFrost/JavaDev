package arraycoding;
import java.io.IOException;


public class cynicallyRotateElement {

    public static void main(String[]Args) throws IOException {
        int[] array = {23, 33, 42, 21, 45, 47, 26, 48, 49};

        cynicallyRotate(array);

    }

    private static void cynicallyRotate(int[] array) {

        int n = array.length;
        int lastElement = array[n-1];

        for(int i = n-1 ; i> 0; i--){
            array[i] = array[i-1];
        }

        array[0] = lastElement;

        for(int num : array){
            System.out.print(num + " ");
        }
        System.out.println();
    }


}
