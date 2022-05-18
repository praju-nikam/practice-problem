package com.bridgelabz.Inheritance;
class Animal10{
    // default or no-arg constructor of class Animal
    Animal10(){
        System.out.println("I am an animal");
    }
}
class  Dog10 extends Animal10{
    // default or no-arg constructor of class Dog
    Dog10(){
        // calling the default constructor of the super class
        super();
        System.out.println("I am a dog");
    }
}
public class UseOfSuper {
    public static void main(String[] args) {
      Dog10 d10 = new Dog10();
    }
}
