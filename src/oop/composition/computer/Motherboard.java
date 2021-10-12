package oop.composition.computer;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlot;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlot, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlot() {
        return cardSlot;
    }

    public String getBios() {
        return bios;
    }
}
