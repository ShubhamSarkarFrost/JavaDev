package practiceprograms;

import java.io.IOException;

public class SwapWithoutThirdVariable {

    public static void main(String[]Args) throws IOException {
        int a = 5;
        int b = 8;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("The Value of A is :"+ a + "The Value of B is"+ b);
    }
}
