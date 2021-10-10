package oop.constructor.point;

public class Point {
    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distance(){
        double calculation = ((-this.x) * (-this.x)) + ((-this.y) * (-this.y));
        return Math.sqrt(calculation);
    }

    public double distance(int x, int y){
        double calculation = ((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y));
        return Math.sqrt(calculation);
    }

    public double distance(Point point){
        double calculation = ((point.getX() - this.x) * (point.getX() - this.x))+ ((point.getY() - this.y) * (point.getY() - this.y));
        return Math.sqrt(calculation);
    }
}
