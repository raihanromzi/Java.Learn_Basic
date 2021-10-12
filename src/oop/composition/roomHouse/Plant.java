package oop.composition.roomHouse;

public class Plant {
    private String flowers;
    private String plant;

    public Plant(String flowers, String plant) {
        this.flowers = flowers;
        this.plant = plant;
    }

    public String getFlowers() {
        return flowers;
    }

    public String getPlant() {
        return plant;
    }

    public void waterTheFlowerAndPlant(){
        System.out.println("This plant and flower has been watered");
    }

    public void move(int x, int y){
        System.out.println("Plant is moving into " + x + "," + y + " Location");
    }
}
