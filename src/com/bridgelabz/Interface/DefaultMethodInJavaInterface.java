package com.bridgelabz.Interface;
interface Polygon1{
    void getArea();
    // default method
    default void getSides(){
        System.out.println("I can get sides of a polygon");
    }
}
// implements the interface
class Rectangle1 implements Polygon1{

    public void getArea() {
    int length = 6;
    int breadth = 5;
    int area = length * breadth;
    System.out.println("The area of rectangle is "+area);
    }
    // overrides the getSides
    @Override
    public void getSides() {
        System.out.println("I have 4 sides");
    }
}
class Square implements Polygon1{
    @Override
    public void getArea() {
        int length = 5;
        int area = length * length;
        System.out.println("The area of Square is " +area);
    }
}

public class DefaultMethodInJavaInterface
{
    public static void main(String[] args) {
       // create an object Rectangle
        Rectangle1 r1 = new Rectangle1();
        r1.getArea();
        r1.getSides();

        // create an object Square
        Square s1 = new Square();
        s1.getArea();
        s1.getSides();
    }
}
