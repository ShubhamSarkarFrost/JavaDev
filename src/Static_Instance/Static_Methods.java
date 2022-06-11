package Static_Instance;

import java.io.IOException;

class Calculator {
    public static void printSum(int a, int b){
        System.out.println("Sum = "+(a+b));
    }
}



public class Static_Methods {

    public static void main(String[]args) throws IOException{
        Calculator.printSum(5,10);
        printHello();
    }

    private static void printHello() {
        System.out.println("Hello User !!");
    }
}
