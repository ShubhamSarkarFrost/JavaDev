package calculator.axion;

public class SimpleCalculator {

    private int firstNumber;
    private int secondNumber;

    public void setFirstNumber(int firstNumber){
        this.firstNumber =  firstNumber;
    }

    public void setSecondNumber(int secondNumber){
        this.secondNumber =  secondNumber;
    }

    public int getFirstNumber(){
        return this.firstNumber;

    }

    public int getSecondNumber(){
        return this.secondNumber;
    }

    public int getAdditionResult(){
        return this.firstNumber + this.secondNumber;
    }

    public  int getSubstractionResult(){
        if(this.secondNumber > this.firstNumber){
            return this.secondNumber - this.firstNumber;
        }
        else
            return this.firstNumber - this.secondNumber;
    }

    public int getMultiplicationResult(){
        return this.firstNumber * this.secondNumber;
    }

    public int getDivisionResult(){
        int div ;
        div = this.firstNumber / this.secondNumber;
        return div;
    }

}
