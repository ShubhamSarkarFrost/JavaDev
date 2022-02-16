import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PoundtoKilogram {

    public static void main(String[]args) throws IOException{

        double pound ;
        double kilogram;
        System.out.println("Enter the Value of the weight in Pound");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        pound = Integer.parseInt(br.readLine());

        if(pound > 0.00){
            double temp_value = pound / 2.00;
            double temp = temp_value / 10.00;
            kilogram = temp_value - temp;
            System.out.println("Converted Value of "+pound+" pounds is "+ kilogram + "kg");
        }else{
            System.out.println("Please Enter a Value greater than Zero ");
        }


    }
}
