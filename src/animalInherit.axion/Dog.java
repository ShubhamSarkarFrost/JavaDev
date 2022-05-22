package animalInherit.axion;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);    // initialized from Animal Class
        this.eyes = eyes;           // initialized from Dog Class
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called ");
        chew();
        super.eat(); // super keyword is to override  the method
    }

    private void chew(){
        System.out.println("Dogs Chew Food !! Dog.chew() called");
    }

    public void walk(){
        System.out.println("Dog.walk() was called!!");
        super.move(5);  // only execute the method in parent class
    }
    public void run(){
        System.out.println("Dog.run() was called !!");
        move(10);   // can execute any method in child class or parent class
    }

    private void movelegs(int speed){
        System.out.println("Dog.movelegs() was called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.Move() called");
        movelegs(speed);
        super.move(speed);
    }
}
