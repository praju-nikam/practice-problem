package com.bridgelabz.Interface;
interface Polygon{
    void getArea(int length,int breadth);
}
// implement the polygon interface
class Rectangle implements Polygon
{
    // implementation of abstract method
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is "+(length * breadth));
    }
}
public class Interface
{
    public static void main(String[] args) {
      Rectangle r1 = new Rectangle();
      r1.getArea(5,6);
    }
}
