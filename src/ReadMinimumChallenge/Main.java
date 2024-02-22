package ReadMinimumChallenge;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int no_of_elem = readInteger();
        int[] returnArray = readIntegers(no_of_elem);
        System.out.println("The Min Element in An Array is : "+ findMin(returnArray));
    }

    public static int readInteger() {
        System.out.println("Enter the No of Elements to Enter: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static int[] readIntegers(int numofel) {
        int [] actualArray = new int[numofel];

        System.out.println("Enter a List of Values followed by comma seperated");
        for(int i = 0 ; i < numofel; i++){
            actualArray[i] = sc.nextInt();
        }
        return actualArray;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int el : array){
            if(el < min){
                min = el;
            }
        }
        return min;
    }



}
