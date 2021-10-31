package data_structure.arrayList.MobilePhone;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final MobilePhone myNumber = new MobilePhone("082299772350");

    public static void main(String[] args) {
        boolean quit = false;
        printInstruction();
        while(!quit){
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0 :
                    printInstruction();
                    break;
                case 1:
                    myNumber.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    System.out.println("\nShutting down...");
                    quit = true;
                default:
                    System.out.println("Your input error!");
            }
        }
    }

    private static void startPhone(){
        System.out.println("Starting phone...");
    }

    public static void printInstruction() {
        System.out.println("\nPress");
        System.out.println("\t0 - To menu");
        System.out.println("\t1 - To print contact");
        System.out.println("\t2 - To add a new contact");
        System.out.println("\t3 - To update contact");
        System.out.println("\t4 - To remove contact");
        System.out.println("\t5 - query if an existing contact exist");
        System.out.println("\t6 - To shutdown");
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name : ");
        String name = scanner.nextLine();

        System.out.println("Enter Phone number ");
        String phoneNumber = scanner.nextLine();

        Contact newContact = Contact.createContact(name, phoneNumber);

        if(myNumber.addNewContact(newContact)){
            System.out.println("New contact added : " + name
                    + "Phone = " + phoneNumber);
        } else {
            System.out.println("Cannot add already on contact list");
        }
    }

    private static void updateContact(){
        System.out.println("Enter contact name you want to update : ");
        String nameContact = scanner.nextLine();

        Contact existingContactRecord = myNumber.queryContact(nameContact);
        if(existingContactRecord == null){
            System.out.println("Contact Not Found");
        } else {
            System.out.println("Enter new contact name : ");
            String newName = scanner.nextLine();

            System.out.println("Enter new number : ");
            String newPhoneNumber = scanner.nextLine();

            Contact newContact = Contact.createContact(newName,newPhoneNumber);

            myNumber.updateContact(existingContactRecord, newContact);
        }
    }

    private static void removeContact(){
        System.out.println("Enter contact name you want to remove : ");
        String name = scanner.nextLine();

        Contact existingContactRecord = myNumber.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
        } else {
            myNumber.removeContact(existingContactRecord);
        }
    }

    private static void queryContact(){
        System.out.println("Enter contact name : ");
        String name = scanner.nextLine();
        Contact existingContactRecord = myNumber.queryContact(name);

        if(existingContactRecord==null){
            System.out.println("Contact not found");
        } else {
            System.out.println("Name : " + existingContactRecord.getName() + "\nPhone : "
                    + existingContactRecord.getPhoneNumber());
        }
    }
}

