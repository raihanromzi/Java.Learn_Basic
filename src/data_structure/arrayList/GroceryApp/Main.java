package data_structure.arrayList.GroceryApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    //  Initializing the Object (Array list is classes)
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit) {
            System.out.print("\nEnter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstruction() {
        System.out.println("\nPress");
        System.out.println("\t0 - Main Menu");
        System.out.println("\t1 - To print the list of Grocery Item");
        System.out.println("\t2 - To add an item to the list");
        System.out.println("\t3 - To modify an item in the list");
        System.out.println("\t4 - To remove an item from the list");
        System.out.println("\t5 - To search for an item in the list");
        System.out.println("\t6 - Copy Array List");
        System.out.println("\t7 - To quit the application");

    }

    public static void addItem() {
        System.out.print("Please Enter the number Item you want to Add : ");
        int count = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please Enter the grocery Item : ");
        for (int i = 0; i <= count - 1; i++) {
            groceryList.addGroceryItem(scanner.nextLine());
        }
    }

    public static void modifyItem() {
        System.out.print("Please Enter Item Number : ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Replacement Item : ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNumber - 1, newItem);
    }

    public static void removeItem() {
        System.out.println("Please Enter Item Number : ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNumber);
    }

    public static void searchForItem() {
        System.out.println("Item to search for : ");
        String searchItem = scanner.nextLine();
        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in our grocery List");
        } else {
            System.out.println(searchItem + " not found!");
        }
    }

    public static void processArrayList() {
//      How to duplicate / copy array list
//      Cara 1
        ArrayList<String> newArrayList = new ArrayList<String>();
        newArrayList.addAll(groceryList.getGroceryList());

//      Cara 2
//      Created a New brand Arraylist, then copy from grocerylist
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

//      Cara 3
//      ArrayList to Array
//      The size of array
        String[] myArray = new String[groceryList.getGroceryList().size()];

//      Copy
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

}
