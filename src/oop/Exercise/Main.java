package oop.Exercise;

public class Main {
    public static void main(String[] args) {
        Hamburger myHamburger = new Hamburger("Basic","Beef",5.02,"White");
        myHamburger.addHamburgerAddition1("Cheese",2.00);
        myHamburger.addHamburgerAddition2("Tomato",0.59);
        myHamburger.addHamburgerAddition3("Egg",3.41);
        myHamburger.addHamburgerAddition4("Bacon",2.57);

        System.out.println("Total hamburger price is " + myHamburger.itemizeHamburger());


    }
}
