package oop.classes.car;

public class Main { //Statements to create a new class in java

    public static void main(String[] args) {
    // Car is a class, but we can treat it as a data type
    // Brio is an object
	Car honda = new Car(); // Initialize the object brio
    Car toyota = new Car();

    // Set the model for object honda to "Brio". Because its public. But it's not a good way.
    // honda.model = "Brio";

    // Calling the method to update the object
    honda.setModel("Brio");
        System.out.println("Model is " + honda.getModel());
    toyota.setModel("yaris");
        System.out.println("Model is " + toyota.getModel());


    }
}
