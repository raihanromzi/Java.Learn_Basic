package data_structure.LinkedList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Tim", 54.96);
        Customer customer2;

//      Java assigning the second customer class to point to the first class
//      Save the memory address of customer 1
        customer2 = customer1;
        customer2.setBalance(12.18);
        System.out.println("Balance for customer " + customer1.getName() + " is " + customer1.getBalance());

//      Array List
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(4);
        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(i + ": " + integerArrayList.get(i));
        }

        System.out.println();

//      Add element 2 in Index 1, moved down
        integerArrayList.add(1, 2);

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(i + ": " + integerArrayList.get(i));
        }

    }
}
