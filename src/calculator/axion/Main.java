package calculator.axion;

import java.io.IOException;

public class Main {

    public static void main(String[]args) throws IOException{

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5);
        calculator.setSecondNumber(4);
        System.out.println("Add = "+ calculator.getAdditionResult());
        System.out.println("Substract ="+ calculator.getSubstractionResult());
        System.out.println("Multiplication = "+ calculator.getMultiplicationResult());
        System.out.println("Division = " + calculator.getDivisionResult());

    }
}
