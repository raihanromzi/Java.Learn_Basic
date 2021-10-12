package oop.inheritance.vehicle;

public class Car extends Vehicle{
    // Field for car
    private int countCarSeat;
    private int windowsCar;
    private String radio;

    // Constructor for car
    public Car(String typeGear, String typeEngine, String functionVehicle, int countCarSeat, int windowsCar, String radio) {
        // Inherit vehicle characteristic
        super(typeGear, typeEngine, 4, functionVehicle);
        setCountCarSeat(countCarSeat);
        setWindowsCar(windowsCar);
        setRadio(radio);
    }

    // Default getter and setter
    public void setCountCarSeat(int carSeat){
        this.countCarSeat = carSeat;
    }

    public void setWindowsCar(int windowsCar){
        this.windowsCar = windowsCar;
    }

    public void setRadio(String radio){
        this.radio = radio;
    }

    public int getCountCarSeat(){
        return this.countCarSeat;
    }

    public int getWindowsCar(){
        return this.windowsCar;
    }

    public String getRadio(){
        return this.radio;
    }

    // Overriding method from superclass (vehicle)

    @Override
    public void move(int nowSpeed) {
        super.move(nowSpeed);
    }

    @Override
    public void changingGear(int nowGear) {
        super.changingGear(nowGear);
    }

    @Override
    public void handSteering(String handSteeringLocation) {
        super.handSteering(handSteeringLocation);
    }
}
