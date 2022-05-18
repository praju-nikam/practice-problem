package com.bridgelabz.Inheritance;

class Animal{
    // field & method of parent class
    String name;
    public void eat(){
        System.out.println("I can eat");
    }
}
// Inherit from Animal
class Dog extends Animal{
    // nwe method in subclass
    void display(){
        System.out.println("My Name is " +name);
    }
}

public class Inheritance {
    public static void main(String[] args) {
    // create an object of subclass
        Dog labrador = new Dog();
    // Access field of superclass
        labrador.name = "Rohu";
        labrador.display();

    // call method of superclass using object of subclass
        labrador.eat();
    }
}
