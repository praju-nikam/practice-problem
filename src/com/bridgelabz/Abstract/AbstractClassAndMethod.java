package com.bridgelabz.Abstract;
abstract class Language{
    // method of abstract class
    public void display(){
        System.out.println("This is java programming");
    }
}
public class AbstractClassAndMethod extends Language
{
    public static void main(String[] args) {

    // create an object of AbstractClassAndMethod
        AbstractClassAndMethod acm = new AbstractClassAndMethod();
        // access method of abstract class using object of AbstractClassAndMethod
        acm.display();
    }
}
