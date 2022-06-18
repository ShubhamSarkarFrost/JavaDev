package CompositionRoom.axion;

public class Bedroom {

    public Wall wall2,wall3,wall4;
    public String wall1;
    public Ceiling ceiling;
    /* Composition Variables */
    public Bed bed;
    public Lamp lamp;

    public Bedroom(String wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }
    /* Composition Functions */
    public Lamp getLamp() {
        return lamp;
    }

    public Bed makeBed(){
        return bed;
    }


}
