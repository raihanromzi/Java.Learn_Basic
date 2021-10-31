package data_structure.arrayList.GroceryApp;

import java.util.ArrayList;

public class GroceryList {
//  Array list can hold object
//  Tell java that in the array list is going to be type of String
//  Array list is a class

    private ArrayList<String> groceryList = new ArrayList<>(/*Constructor*/);

//  Copy to another array list
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
//      Add the item to Array List, automatically saved the location where to save it
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " Items in you Grocery List");
        for (int i = 0; i < groceryList.size(); i++) {
//          Get item index i
            System.out.println(i + 1 + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery Item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
//      Searching is the element is existed or not
//      boolean exists = groceryList.contains(searchItem);

//      Searching where is index of the Item, -1 if it didn't exist
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }

        return null;
    }

}
