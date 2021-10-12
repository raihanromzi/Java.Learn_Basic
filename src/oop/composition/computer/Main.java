package oop.composition.computer;

public class Main {
    public static void main(String[] args) {

//      Resolution object created without making variable (A new way to create object
        Case theCase = new Case("220B","Dell","240", new Dimensions(20,20,5));
        Monitor theMonitor = new Monitor("27inch ROG", "Asus", 27, new Resolution(2540,1440));
        Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus", 4,6,"v2.44");

//      PC
        PC myPC = new PC(theCase, theMonitor, theMotherBoard);

//      Calling the method from class monitor via myPC
        /*
        myPC.getTheMonitor().drawPixelAt(1500,1200,"red");
        myPC.getTheMotherBoard().loadProgram("Mac OS");
        myPC.getTheCase().pressPowerbutton();
         */

        myPC.powerUp();

    }
}
