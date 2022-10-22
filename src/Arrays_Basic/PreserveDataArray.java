package Arrays_Basic;

import java.io.IOException;
import java.util.Scanner;

public class PreserveDataArray {


    private static Scanner sc = new Scanner(System.in);
    private static int[] BaseData = new int[10];

    public static void main(String[]args) throws IOException{
        System.out.println("Enter 10 Integers \n");
        getInput();
        printArray(BaseData);
        resizeArray();
        System.out.println("Enter 12 Integers \n");
        getInput();
        printArray(BaseData);

    }

    public static void getInput(){

        int i;
        for(i=0; i<BaseData.length; i++){
            BaseData[i] = sc.nextInt();
        }

    }

    public static void printArray(int[] data){
        int elem;
        System.out.println("Elements in Your Array are:");
        for(elem = 0; elem<data.length; elem++){
            System.out.println(data[elem]);
        }

    }

    public static void resizeArray(){
        int[]original = BaseData;
        BaseData = new int[12];
        for(int i = 0 ; i<original.length; i++){
            BaseData[i] = original[i];
        }
    }
}
