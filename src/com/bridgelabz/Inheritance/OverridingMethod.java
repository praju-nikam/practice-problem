package com.bridgelabz.Inheritance;
class Animal7{
    // overriding method
    public void display(){
        System.out.println("I am an animal");
    }
}
class Dog7 extends Animal7{
    // overriding method

    @Override
    public void display() {
        System.out.println("I am a dog");
    }
    public  void printMessage(){
        display();
    }
}
public class OverridingMethod
{
    public static void main(String[] args) {
        Dog7 d7 = new Dog7();
       d7.printMessage();
    }
}
