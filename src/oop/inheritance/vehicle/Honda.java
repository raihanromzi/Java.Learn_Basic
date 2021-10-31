package oop.inheritance.vehicle;

public class Honda extends Car{
    private String nameModel;
    private String typeCar;

    public Honda(String typeGear, String typeEngine, String functionVehicle, int countCarSeat, int windowsCar, String radio, String nameModel, String typeCar) {
        super(typeGear, typeEngine, functionVehicle, countCarSeat, windowsCar, radio);
        setNameModel(nameModel);
        setTypeCar(typeCar);
    }


    public void setNameModel(String nameModel){
        this.nameModel = nameModel;
    }

    public void setTypeCar(String typeCar){
        this.typeCar = typeCar;
    }

    public String getNameModel(){
        return this.nameModel;
    }

    public String getTypeCar(){
        return this.typeCar;
    }

    @Override
    public void handSteering(String handSteeringLocation) {
        System.out.println("Honda has Hand-to-hand steering");
        super.handSteering(handSteeringLocation);
    }


}
