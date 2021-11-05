package data_structure.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//      Initialize LinkedList same as ArrayList
        LinkedList<String> city = new LinkedList<>();
        addInOrder(city, "Jakarta");
        addInOrder(city, "Bandung");
        addInOrder(city, "Surabaya");
        addInOrder(city, "Jogjakarta");
        addInOrder(city, "Medan");
        addInOrder(city, "Alice Spring");
        addInOrder(city,"Jakarta");

        printList(city);
        visit(city);

        /*
        city.add("Jakarta");
        city.add("Bandung");
        city.add("Surabaya");
        city.add("Jogjakarta");
        city.add("Medan");
        printList(city);

        System.out.println();
        city.add(0,"Palembang");
        printList(city);

        System.out.println();
        city.remove(4);
        printList(city);

         */

    }

    private static void printList(LinkedList<String> linkedList){
//      Single Linked List (No Previous)
        Iterator i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now Visiting " + i.next());
        }
    }

//  Make a linked list, that ordered alphabetically
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
//      Like iterator, but more flexible
        ListIterator<String> stringListIterator = linkedList.listIterator();

//      Check if the next element is not null
        while(stringListIterator.hasNext()){
//          If 0 means index stringListIterator(i) equal to newCity
            int comparison = stringListIterator.next().compareTo(newCity);

            if(comparison == 0){
//              Equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
//              newCity should appear before i, but comparison is next() it means the pointer already go to next i
//              If the parameter city alphabet before the city in list, We have to move to previous element
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    public static void visit(LinkedList<String> cities){
        ListIterator<String> listIterator = cities.listIterator();

//      Check is the list empty
        if(cities.isEmpty()){
            System.out.println("No cities");
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        boolean quit = false;
        boolean goingFoward = false;
        boolean goingBackward = false;
        while (!quit){
            int input = scanner.nextInt();
            switch (input){
                case 0:
                    System.out.println("Holiday over!");
                    quit = true;
                    break;
                case 1:
                    if(!goingFoward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                            goingFoward = true;
                        }
                    }

                    if (listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reach the end of city");
                        goingFoward = false;
                    }
                    break;
                case 2:
                    if(!goingBackward){
                       if (listIterator.hasPrevious()){
                           listIterator.previous();
                           goingBackward = true;
                       }
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("Reach the start of city");
                        goingBackward = false;
                    }
                    break;
                default:
                    printMenu();
            }
        }
    }

    private static void printMenu(){
        System.out.println("Menu : \n Input Number");
        System.out.println("0 - To Quit\n" +
                "1 - Go to next city\n" +
                "2 - Go to previous city\n" +
                "3 - Print menu");
    }
}
