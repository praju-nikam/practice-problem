package com.bridgelabz.Inheritance;
class Animal4{
    public void displayInfo(){
        System.out.println("I am an animal");
    }
}
class Dog4 extends Animal4{
    @Override
    public void displayInfo() {
        System.out.println("I am a dog");
    }
}
public class MethodOverriding
{
    public static void main(String[] args) {
    Dog4 d1 = new Dog4();
    d1.displayInfo();
    }
}
