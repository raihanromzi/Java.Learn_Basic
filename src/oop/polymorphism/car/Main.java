package oop.polymorphism.car;

class Car{
    private String nameCar;
    private boolean engine;
    private int cylinder;
    private int wheels;

    public Car(String nameCar,int cylinder) {
        this.nameCar = nameCar;
        this.engine = true;
        this.cylinder = cylinder;
        this.wheels = 4;
    }

    public String getNameCar() {
        return nameCar;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void StartEngine(){
        System.out.println("Car -> startEngine()");
    }

    public void accelerate(){
        System.out.println("Car -> accelerate()");
    }

    public void brake(){
        System.out.println("Car -> brake()");
    }
}

class Brio extends Car{
    public Brio() {
        super("Brio", 4);
    }

    @Override
    public void StartEngine() {
        System.out.println("Brio -> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("Brio -> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("Brio -> brake()");
    }
}

class Terra extends Car{
    public Terra() {
        super("Terra", 10);
    }

    @Override
    public void StartEngine() {
        System.out.println("Terra -> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("Terra -> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("Terra -> brake()");
    }
}

class BMW extends Car{
    public BMW() {
        super("BMW", 8);
    }

    @Override
    public void StartEngine() {
        System.out.println("BMW -> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("BMW -> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("BMW -> brake()");
    }
}

public class Main {
    public static void main(String[] args) {
        Car baseCar = new Car("Base Car", 8);
        baseCar.StartEngine();
        baseCar.accelerate();
        baseCar.brake();

        Car brio = new Brio();
        brio.StartEngine();
        brio.accelerate();
        brio.brake();

        Car terra = new Terra();
        terra.StartEngine();
        terra.accelerate();
        terra.brake();

    }
}
