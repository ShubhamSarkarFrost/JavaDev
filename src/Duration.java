import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Duration {

    public static void main(String[] args) throws IOException{

        long min, sec;
        System.out.println("Welcome to Time Conversion Program \n");
        System.out.println("Please Enter the no of Minutes");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        min = Long.parseLong(br.readLine());
        System.out.println("Please Enter the no of Seconds");
        sec = Long.parseLong(br.readLine());
        System.out.println(getDurationString(min,sec));
        System.out.println(getDurationString(55000));


    }

    private static String getDurationString(long minutes, long seconds){

        if((minutes < 0)||(seconds < 0) || (seconds > 59)){
            return "Invalid Value";
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + " HH " + remainingMinutes + " MM " + seconds + " SS ";
    }

    // one Function inside another function , code below
    private static String getDurationString(long seconds){

        if(seconds < 0){
            return "Invalid Value";
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes,remainingSeconds);
    }
}
