package oop.classes.car;

public class Car { // Statement to create new class named car
    // Need to specify access modifier too. Use private access modifier for field.
    // Don't need to give value for variable. Always go with private.
    // This is state of car or field.

    private int door;
    private int wheels;
    private String model;
    private String engine;
    private String colors;

    public void setModel(String model){
        String isValid = model.toLowerCase();
        if(isValid.equals("brio") || isValid.equals("rush")){
            this.model = model; //Update the field model to the parameter
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }


}
