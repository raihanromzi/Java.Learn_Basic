package oop.classes.person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("full name= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        person.setFirstName("John");
        person.setAge(18);
        System.out.println("full name= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        person.setLastName("Smith");
        person.setAge(-5);
        System.out.println("age= " + person.getAge());
        System.out.println("full name= " + person.getFullName());
    }
}
