package dev.lpa;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){

        if(findContact(contact) != -1){
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    private int findContact(Contact contactToSearch){

        for(int i = 0; i<myContacts.size(); i++){
            if(myContacts.get(i).getName() == contactToSearch.getName()){
                return i;
            }
        }
        return -1;

    }

    private int findContact(String contactName){

        for(int i = 0; i<myContacts.size(); i++){
            if(myContacts.get(i).getName() == contactName){
                return i;
            }
        }
        return -1;

    }



}


class Contact{
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }
}