package oop.Interface_AbstactClass;

public class Gearbox {
    private boolean clutchIsIn;

    public void operateClutch(String inOrOut){
        this.clutchIsIn = inOrOut.equalsIgnoreCase("in");
        System.out.println(this.clutchIsIn);
    }

    public static void main(String[] args) {
        Gearbox i = new Gearbox();
        i.operateClutch("IN");
    }
}
