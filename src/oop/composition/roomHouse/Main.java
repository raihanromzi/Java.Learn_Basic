package oop.composition.roomHouse;

public class Main {
    public static void main(String[] args) {
        Plant thePlant = new Plant("Rose","Mango");
        Furniture theFurniture = new Furniture("IKEA","IKEA",2,2);

        Room myRoom = new Room(thePlant, theFurniture);

        // Running composition from Room that access Plant and Furniture Method
        myRoom.careRoom();
        myRoom.carePlant();

    }
}
