package com.bridgelabz.Encapsulation;
class Area{
    // fields with calculate area
    int length;
    int breadth;

    // constructor with initialise value

    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // method to calculate area
    public void getArea(){
        int area = length * breadth;
        System.out.println("Area : " +area);
    }
}
public class Encapsulation
{
    public static void main(String[] args) {
     // create object of Area Class pass value of length & breadth
        Area rectangle = new Area(5,6);
        rectangle.getArea();
    }
}
