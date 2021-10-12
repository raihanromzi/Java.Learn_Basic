package oop.inheritance.animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1,1,5,5);

        Dog dog = new Dog("Mike", 20, 20,2, 4,1,100,"Silky");

//      Dog inherit animal method (eat)
//        dog.eat();
        dog.walk(); //called move method in animal class
        dog.run(); //called move method in dog class with overriding
    }
}
