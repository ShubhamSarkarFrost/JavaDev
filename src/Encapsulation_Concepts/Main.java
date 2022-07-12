package Encapsulation_Concepts;

import java.io.IOException;

public class Main {

    public static void main(String[]Args) throws IOException{
//        Player play = new Player();
//        play.Name = "Tim";
//        play.health = 20;
//        play.weapon = "Sword";
//
//        int damage = 10;
//        play.loseHealth(damage);
//        System.out.println("Remaining Helath = "+play.healthRemaining());
//
//        damage = 11;
//        play.loseHealth(damage);
//        System.out.println("Remaining Health = "+play.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim",100,"Sword");
        int damage = 90;
        player.loseHealth(damage);
        System.out.println(player.healthRemaining());

        damage = 20;
        player.loseHealth(damage);
        System.out.println(player.healthRemaining());



    }
}
