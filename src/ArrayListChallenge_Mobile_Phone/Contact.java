package ArrayListChallenge_Mobile_Phone;

public class Contact {
    private String name;
    private String phonenumber;

    public Contact(String name, String phonenumber) {
        this.name = name;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public static Contact createNewContact(String name, String phonenumber){
        return  new Contact(name,phonenumber);
    }
}
