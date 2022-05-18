package com.bridgelabz.Inheritance;

class Animal1{
    // method in the super class
    public void  eat(){
        System.out.println("I can eat");
    }
}
// Dog Inherit Animal
class Dog1 extends Animal1{
    // overriding the eat() method
    @Override
    public void eat() {
        System.out.println("I eat dog food");
    }
    // new method in subclass
    public void bark(){
        System.out.println("I can bark");
    }
}

public class Overriding
{
    public static void main(String[] args) {

        // create an object of subclass
        Dog1 labrador = new Dog1();
        // call the eat() method
      labrador.eat();
      labrador.bark();
    }
}
