import java.io.IOException;
import java.util.Scanner;

public class Comparethreedecimal {

    public static boolean uptothreedecimalplaces(double numone , double numtwo){
        boolean match = false;
        numone = Math.round(numone * 1000);
        numone = numone / 1000;

        numtwo = Math.round(numtwo * 1000);
        numtwo = numtwo / 1000;

        if(numone == numtwo){
            match = true;
        }

       return match;
    }

     public static void main(String[]args) throws IOException {
        double Firstnum , Secondnum;
        System.out.println("Welcome to Number Matcher");
         Scanner sc = new Scanner(System.in);
         System.out.println("Please Enter Your First Number \n");
         Firstnum = sc.nextDouble();
         System.out.println("Please Enter Your Second Number \n");
         Secondnum = sc.nextDouble();

         if(uptothreedecimalplaces(Firstnum,Secondnum)){
             System.out.println(Firstnum+" matches with "+Secondnum+" For upto Three Decimal Places");
         }else{
             System.out.println(Firstnum+ " does not Match with "+Secondnum);
         }

     }
}
