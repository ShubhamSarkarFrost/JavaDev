package car.axiom;

import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // setters
    public void setModel(String model){
        String ValidModel = model.toLowerCase();
        if(ValidModel.equals("carrera") || ValidModel.equals("supersnake")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }

    }

    // getters
    public String getModel(){
        return this.model;
    }
}
