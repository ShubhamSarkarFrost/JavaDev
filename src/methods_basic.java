import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class methods_basic {



    public static int final_score(int score, int level_completed, int bonus){
        int Final_Score;
        Final_Score = score +(level_completed * bonus);
        return Final_Score;
    }

    public static void main(String[]args) throws IOException {
        int score_g,level_completed_g,bonus_g;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the Current Score of the Gamer");
        score_g = Integer.parseInt(br.readLine());
        System.out.println("Please Enter the Bonus level completed by the gamer");
        bonus_g = Integer.parseInt(br.readLine());
        System.out.println("Please Enter the Level Completed by the Gamer");
        level_completed_g = Integer.parseInt(br.readLine());
        System.out.println("Total Score of the Gamer is"+final_score(score_g,level_completed_g,bonus_g));


    }
}
