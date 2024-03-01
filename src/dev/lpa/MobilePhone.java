package dev.lpa;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    // TODO: findContact()
    public void addNewContact(Contact contact){

        myContacts.add(contact);
    }
}


class Contact{

}