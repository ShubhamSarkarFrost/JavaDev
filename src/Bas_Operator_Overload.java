import java.io.IOException;

public class Bas_Operator_Overload {

    public static void main(String[] args) throws IOException {
        int newScore ;
        newScore = calculate_score("Tim", 500);
        System.out.println("New Score is" + newScore);
        newScore = calculate_score();
        System.out.println("New Score is "+ newScore);
        newScore = calculate_score(1000);
        System.out.println("New Score is "+ newScore);

    }

    public static int calculate_score(String playername, int score) {
        System.out.println("Player " + playername + " Scored" + score + " Points");
        return score * 1000;
    }

    public static int calculate_score(int score){
        return score * 750;
    }

    public static int calculate_score(){
        System.out.println("No Player Name & No Player Score");
        return 0;
    }
}
