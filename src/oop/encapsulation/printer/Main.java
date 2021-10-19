package oop.encapsulation.printer;

public class Main {
    public static void main(String[] args) {
        Printer myPrinter = new Printer(50,true);
        System.out.println(myPrinter.getPagesPrinted());
        System.out.println(myPrinter.addToner(50));
        System.out.println(myPrinter.printPages(10));

        System.out.println(myPrinter.printPages(10));

    }
}
