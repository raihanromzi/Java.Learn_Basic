package oop.inheritance.vehicle;

public class Main {
    public static void main(String[] args) {
        Honda brio = new Honda("Automatic", "V-Engine","Daily"
        , 4, 4, "Yes", "Brio", "City Car" );

        System.out.println(brio.getNameModel());
        System.out.println(brio.getTypeCar());
        System.out.println(brio.getTypeGear());
        System.out.println(brio.getCountWheel());
        brio.handSteering("Right");
    }
}
