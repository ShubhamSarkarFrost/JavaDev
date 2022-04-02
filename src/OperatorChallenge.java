import java.io.IOException;

public class OperatorChallenge {

    public static void main(String[] args) throws IOException {
        double numone, numtwo, output, sum;
        boolean value = false;
        numone = 20.00;
        numtwo = 20.00;

        /* according to the challenge  */
        sum = numone + numtwo ;
        sum = sum * 100 ;

        output = sum % 40.00;
        if(sum == 0){
            value = true;
        }
        System.out.println("The Value of the Operation is :" + value);









    }
}
