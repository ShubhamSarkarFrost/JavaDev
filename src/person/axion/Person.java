package person.axion;

public class Person {

    private String FirstName;
    private String LastName;
    private int Age;

    // setters
    public String getFirstName(){
        return this.FirstName;
    }

    public String getLastName(){
        return this.LastName;
    }

    public int getAge(){
        return  this.Age;
    }


    // getters
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName){
        this.LastName = LastName;
    }

    public  void setAge(int Age){
        this.Age = Age;
    }

    //isTeen function
    public boolean isTeen(){
        if(this.Age >= 12 && this.Age <= 20){
            return true;
        }else{
            return false;
        }
    }

    //getFullName
    public String getFullName(){
        boolean NameFirstEmpty = this.FirstName.isEmpty();
        boolean NameLastEmpty = this.LastName.isEmpty();

        if(NameFirstEmpty == true && NameLastEmpty == true){
            return " ";
        }
        else if(NameFirstEmpty == true && NameLastEmpty == false){
            return this.FirstName;
        }
        else if(NameFirstEmpty == false & NameLastEmpty == true){
            return this.LastName;
        }else
            return this.FirstName +" "+ this.LastName;
    }
}
