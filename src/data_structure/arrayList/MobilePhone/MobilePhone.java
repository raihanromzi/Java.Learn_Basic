package data_structure.arrayList.MobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    private String phoneNumber;
    private ArrayList<Contact> contactArrayList;

    public MobilePhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.contactArrayList = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) != -1) {
            System.out.println("Contact is already on file");
            return false;
        } else {
            contactArrayList.add(contact);
            return true;
        }
    }

    public void updateContact(Contact oldContact, Contact newContact) {
        int foundContact = findContact(oldContact);
        if (foundContact != -1) {
            if(findContact(newContact.getName()) == -1 ){
                System.out.println("contact with name " + newContact.getName()
                        + " already exist. Update not successful");
            } else {
                this.contactArrayList.set(foundContact, newContact);
                System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());

            }
        } else {
            System.out.println(oldContact.getName() + " , was not found!");
        }
    }

    //  Method to show the number, not find will return -1
    private int findContact(Contact contact) {
        return this.contactArrayList.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < contactArrayList.size(); i++) {
            Contact contactFinder = this.contactArrayList.get(i);
            if (contactFinder.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) != -1) {
            return contact.getName();
        } else {
            return null;
        }
    }

    public void removeContact(Contact contact) {
        int foundContact = findContact(contact);
        if (foundContact != -1) {
            this.contactArrayList.remove(foundContact);
            System.out.println(contact.getName() + ", was deleted");

        } else {
            System.out.println(contact.getName() + ", was not found");
        }
    }

    public void printContacts(){
        if(contactArrayList.size() == 0){
            System.out.println("Nothing in here");
        } else {
            for (int i = 0; i < contactArrayList.size(); i++) {
                System.out.println((i + 1) + " . "
                        + "\t" + contactArrayList.get(i).getName()
                        + " -> " + contactArrayList.get(i).getPhoneNumber());
            }
        }
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position != -1){
            return this.contactArrayList.get(position);
        }
        return null;
    }

}