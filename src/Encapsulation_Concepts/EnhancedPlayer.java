package Encapsulation_Concepts;

public class EnhancedPlayer {

    private String Name;
    private int Health = 100;
    private String Weapon;

    public EnhancedPlayer(String Name, int Health, String Weapon){
          this.Name = Name;
          if(Health >0 && Health <= 100) {
              this.Health = Health;
          }
          this.Weapon = Weapon;
    }

    public void loseHealth(int damage){
        this.Health =  this.Health - damage;
        if(this.Health <=0){
            System.out.println("Player is Knocked Out !!!");
            //reduce the number of lives

        }
    }

    public int healthRemaining() {
        return this.Health;
    }


}
