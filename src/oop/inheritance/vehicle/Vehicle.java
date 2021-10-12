package oop.inheritance.vehicle;

public class Vehicle {
    private String typeGear;
    private String typeEngine;
    private int countWheel;
    private String functionVehicle;

    // Default Constructor
    public Vehicle(String typeGear, String typeEngine, int countWheel, String functionVehicle) {

        setTypeGear(typeGear);
        setTypeEngine(typeEngine);
        setCountWheel(countWheel);
        setFunctionVehicle(functionVehicle);
    }

    // Default Setter and Getter
    public void setTypeGear(String typeGear){
        this.typeGear = typeGear;
    }

    public void setTypeEngine(String typeEngine){
        this.typeEngine = typeEngine;
    }

    public void setCountWheel(int countWheel){
        this.countWheel = countWheel;
    }

    public void setFunctionVehicle(String functionVehicle){
        this.functionVehicle = functionVehicle;
    }

    public String getTypeGear(){
        return this.typeGear;
    }

    public String getTypeAcceleration(){
        return this.typeEngine;
    }

    public int getCountWheel(){
        return this.countWheel;
    }

    public String getFunctionVehicle(){
        return this.functionVehicle;
    }

    // Additional Method basic for Vehicle
    public void move(int nowSpeed){
        System.out.println("This vehicle is moving " + nowSpeed + "Km/H");
    }

    public void changingGear(int nowGear){
        System.out.println("This vehicle is currently on " + nowGear + "Gear");
    }

    public void handSteering(String handSteeringLocation){
        System.out.println("This vehicle hand steering is located on " + handSteeringLocation + " Handed");
    }







}
