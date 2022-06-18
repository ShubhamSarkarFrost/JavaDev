package carInherit.axion;

public class Vehicle {

    private String name;
    private String size;

    private int currentvelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentvelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection = direction;
        System.out.println("Vehicle.steer(): Steering at "+currentDirection +"degrees");
    }

    public void move(int direction, int velocity){
        this.currentDirection = direction;
        this.currentvelocity = velocity;
        System.out.println("Vehicle is Steering at :"+currentDirection +"degrees");
        System.out.println("Vehicle is Moving at the Current velocity of "+currentvelocity+"m/ph");
    }

    //create  getters

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentvelocity() {
        return currentvelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
    public void stop() {
        this.currentvelocity = 0;
    }
}