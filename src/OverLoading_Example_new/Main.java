package OverLoading_Example_new;

import java.io.IOException;

public class Main {

    public static void main(String[]Args) throws IOException {
        int totalScore = calculateScore("Derek",1000);
        System.out.println("Total Score of Player : "+ totalScore);
        calculateScore(1000);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player Name : "+ playerName + "Player Score :" + score);
        return  score * 10000;
    }

    public static void calculateScore(int score){
        System.out.println("Unnamed Player Score "+ score);
    }

    public static void calculateScore(){
        System.out.println("Unnamed Player Scored - Unnamed Score");
    }
}
