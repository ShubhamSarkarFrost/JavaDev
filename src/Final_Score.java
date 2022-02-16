import java.io.IOException;
import java.util.Scanner;

public class Final_Score {

    public static int finalscore(int score, int level_completed, int bonus){
        int final_score;
        final_score = score +(level_completed * bonus);
        return  final_score;
    }

    public static void main(String[] args) throws IOException {
        boolean mgameover;
        int score, level, bonus, finalscore;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Score you Got ?");
        score = sc.nextInt();
        System.out.println("Enter the Level's You have crossed ?");
        level = sc.nextInt();
        System.out.println("Enter the bonus Score you crossed ?");
        bonus = sc.nextInt();
        System.out.println("Enter the GameOver Option ? true-GameOver & false- PlayGame");
        mgameover = sc.nextBoolean();

        if(mgameover){
            finalscore = finalscore(score,level,bonus);
            System.out.println("The Final Score of You is : "+ finalscore);
        }else{
            score = score +1000;
            level = level+ 5;
            bonus = bonus+1000;
            finalscore = finalscore(score,level,bonus);
            System.out.println("The Final Score of You is : "+ finalscore);
        }
    }
}
