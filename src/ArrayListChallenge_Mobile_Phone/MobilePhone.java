package ArrayListChallenge_Mobile_Phone;

import java.util.ArrayList;

public class MobilePhone {
    private String phoneNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber, ArrayList<Contact> myContacts) {
        this.phoneNumber = phoneNumber;
        this.myContacts = myContacts;
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >=0) {
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newConatct){
        int foundPosition = findContact(oldContact);
        if(foundPosition <0){
            System.out.println("The User was not found in our Records "+oldContact.getName());
            return false;
        }
        this.myContacts.set(foundPosition, newConatct);
        System.out.println("The Old Contact "+oldContact.getName()+" was replaced by new Contact "+newConatct.getName());
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i =0; i<this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
}
