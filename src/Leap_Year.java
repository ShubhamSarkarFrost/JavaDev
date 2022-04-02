import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leap_Year {

    public static boolean isLeapYear(int year){
        boolean leapyear = false;
        if(((year % 4 == 0) && (year % 100 != 0)) ||
                (year % 400 == 0)){
           leapyear = true;
        }
        return leapyear;
    }

    public static void main(String[]args)throws IOException {
        int checkyear ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Year to Check Leap Year or Not \n");
        checkyear = Integer.parseInt(br.readLine());
        if(isLeapYear(checkyear)){
            System.out.println("Is a Leap Year " + checkyear);
        }else{
            System.out.println("Is Not a Leap Year " + checkyear);
        }

    }
}
