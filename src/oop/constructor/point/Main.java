package oop.constructor.point;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(6,5);
        Point point2 = new Point(3,1);

        System.out.println("distance(0,0)\t\t= " + point1.distance());
        System.out.println("distance(point2)\t= " + point1.distance(point2));
        System.out.println("distance(2,2\t\t= " + point1.distance(2,2));

        Point point = new Point();
        System.out.println("distance()\t\t\t= " + point.distance());
    }
}
