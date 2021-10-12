package oop.inheritance.animal;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

//     Initialize the animal class

//    public Dog(String name, int brain, int body, int size, int weight) {
//        super(name, brain, body, size, weight);
//    }

//  We can make it smarter
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
//      Called animal constructor will be called using super (initialize), if we dont call super,
//      java automatically will call super in compiler and use default value
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.coat = coat;
        this.teeth = teeth;
        this.tail = tail;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

//  We use method from animal, and we can modify in dog classes
    @Override
    public void eat() {
        System.out.println("Dog.eat called");
        chew();
//      The super class for this class is Animal, so java automatically go back to animal and call
        super.eat();
    }

//  Use super. to access method from super class
    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }

//  If we're not using super. we access method from child class
    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called (override)");
        moveLegs(speed);
        // super.move(speed); // We can use this or not
    }
}
