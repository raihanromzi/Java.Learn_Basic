package oop.composition.roomHouse;

public class Room {
    private Plant thePlant;
    private Furniture theFurniture;

    public Room(Plant thePlant, Furniture theFurniture) {
        this.thePlant = thePlant;
        this.theFurniture = theFurniture;
    }

    public void carePlant(){
        thePlant.waterTheFlowerAndPlant();
        thePlant.move(1,2);
    }

    public void careRoom(){
        theFurniture.howManyFurniture();
        theFurniture.sitDown();
    }
}
