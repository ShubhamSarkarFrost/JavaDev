import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate_Feet_Inches {

    public static void main(String[] args) throws IOException {

        int choice;
        double feet, inches, conversion;

        System.out.println("Welcome to Conversion Program :)");
        System.out.println("Please Enter whether you want to 1-Enter only Inches or 2-Both Inches & Feet's");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        choice = Integer.parseInt(br.readLine());

        if (choice == 1) {
            System.out.println("Please Enter the No of Inches");
            inches = Double.parseDouble(br.readLine());
            conversion = calcFeetAndInchesToCentimetes(inches);
            if (conversion == -1.0) {
                System.out.println("Please Enter Correct Inches");
            } else {
                System.out.println("No of Centimetres are " + conversion);
            }
        } else {
            System.out.println("Please Enter No of Inches");
            inches = Double.parseDouble(br.readLine());
            System.out.println("Please Enter No of Feet's");
            feet = Double.parseDouble(br.readLine());

            conversion = calcFeetAndInchesToCentimetes(feet, inches);
            if (conversion == -1.0) {
                System.out.println("No of Centimetres are " + conversion);
            } else {
                System.out.println("No of Centimetres are " + conversion);
            }

        }


    }

    public static double calcFeetAndInchesToCentimetes(double feet, double inches) {

        double convert = 0;
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            convert = -1;
        } else {
            convert = (feet * 30.48) + (inches * 2.54);
        }
        return convert;
    }

    public static double calcFeetAndInchesToCentimetes(double inches) {
        double convert = 0;
        if (inches < 0) {
            convert = -1;
        } else {
            convert = inches * 2.54;
        }

        return convert;
    }

}
