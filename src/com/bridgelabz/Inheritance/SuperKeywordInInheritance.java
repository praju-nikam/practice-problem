package com.bridgelabz.Inheritance;

class Animal2{
    // method in the superclass
    public void eat(){
        System.out.println("I can eat");
    }
}
// Dog inherits Animal
class Dog2 extends Animal2
{
    // overriding the eat() method
    @Override
    public void eat(){
        //call the method of superclass
        super.eat();
        System.out.println("I eat dog food");
    }
    // new method in subclass
    public void bark(){
        System.out.println("I can bark");
    }
}
public class SuperKeywordInInheritance
{
    public static void main(String[] args) {
        // create an object of subclass
        Dog2 labrador = new Dog2();
        labrador.eat();
        labrador.bark();
    }
}
