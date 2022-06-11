package Overloading_Overriding;

public class Dog_Override {

    public void bark(){
        System.out.println("Woff Says the Override");
    }

    public void bark(int num){
        for(int i =0; i <num; i++){
            System.out.println("Woff says the Dog"+ i);
        }
    }
}
