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

    public boolean updateContact(Contact oldContact, Contact newContact){
        int oldContactIndex = findContact(oldContact);
        if(oldContactIndex == -1){
            return false;
        }

        myContacts.set(oldContactIndex, newContact);
        return true;

    }

    public boolean removeContact(Contact contactToRemove){
        int indexToRemove = findContact(contactToRemove);
        if(indexToRemove == -1){
            return false;
        }

        myContacts.remove(indexToRemove);
        return true;
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

    public Contact queryContact(String contactName){
        int indexOfContact = findContact(contactName);
        return indexOfContact == -1 ? null : myContacts.get(indexOfContact);
    }

    public void printContacts() {
        System.out.println("Contact List:");

        int contactNumber = 1;
        for (Contact contact : myContacts) {
            System.out.printf("%d. %s -> %s\n", contactNumber, contact.getName(), contact.getPhoneNumber());
            contactNumber++;
        }
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