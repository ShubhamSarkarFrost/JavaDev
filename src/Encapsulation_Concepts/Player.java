package Encapsulation_Concepts;

public class Player {

    public String Name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
       this.health =  this.health - damage;
       if(this.health <=0){
           System.out.println("Player is Knocked Out !!!");
           //reduce the number of lives

       }
    }

   public int healthRemaining() {
        return this.health;
   }
}
