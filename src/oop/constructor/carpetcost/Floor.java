package oop.constructor.carpetcost;

public class Floor {
    private final double width;
    private final double length;

    public Floor(double width, double length){
        if(width < 0){
            width = 0;
        }
        if(length < 0){
            width = 0;
        }

        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return this.width * this.length;
    }
}
