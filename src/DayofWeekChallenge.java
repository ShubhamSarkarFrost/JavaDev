import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayofWeekChallenge {

    public static void DayofWeek(int day){

        switch (day) {
            case 1:
                System.out.println("Day is Monday");
                break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thusday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 7 :
                System.out.println("Day is Saturday");
                break;
            case 8:
                System.out.println("Day is Sunday");
                break;
            default:
                System.out.println("You have entered an invalid day");


        }
    }

    public static void main(String[]args) throws IOException {

        int daynum ;
        String nameofday;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter Day of the Week you wanted to print \n");
        daynum = Integer.parseInt(br.readLine());
        DayofWeek(daynum);
    }
}
