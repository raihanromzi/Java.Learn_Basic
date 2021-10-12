package oop.inheritance.cylinder;

public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0){
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public double getArea(){
        return(this.radius * this.radius * Math.PI );
    }

}
