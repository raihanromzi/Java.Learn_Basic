package oop.composition.computer;

public class PC {
//  PC has case, monitor, motherboard
//  Inherit only from 1 class
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherBoard;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherBoard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherBoard = theMotherBoard;
    }
/*
    public Case getTheCase() {
        return theCase;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public Motherboard getTheMotherBoard() {
        return theMotherBoard;
    }
 */

    // We can make it not accessible from Main.java,
    // but at this point we don't need getter
    // Use getter if we need to check the object had been initialized, verification, validation
    /*
    private Case getTheCase() {
        return theCase;
    }

    private Monitor getTheMonitor() {
        return theMonitor;
    }

    private Motherboard getTheMotherBoard() {
        return theMotherBoard;
    }
     */

    public void powerUp(){
        theCase.pressPowerbutton();
        drawLogo();
    }

    public void drawLogo(){
        theMonitor.drawPixelAt(1200,900,"Blue");
    }
}
