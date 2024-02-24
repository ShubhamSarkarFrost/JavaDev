package InterFace_Implementation;

record DragonFly(String name, String type) implements FlightEnabled {

    @Override
    public void TakeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
class Satelite implements OrbitEarth {


    public void achieveOrbits() {
        System.out.println("Orbit Achieved!!");
    }

    @Override
    public void TakeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface OrbitEarth extends FlightEnabled {
    void achieveOrbits();
}

interface FlightEnabled{

    double MIL_To_KMS = 1.60934;
    double KM_TO_MILS = 0.621371;
    public abstract void TakeOff();
    abstract void land();
    void fly();
}
interface Trackable{
    void track();
}
public abstract class Animal {

    public abstract void move();
}
