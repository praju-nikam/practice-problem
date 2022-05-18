package com.bridgelabz.Inheritance;

class Animal6{
    protected void displayInfo(){
        System.out.println("I am an animal");
    }
}
class Dog6 extends Animal6{
    public void displayInfo(){
        System.out.println("I am a dog");
    }
}
public class AccessSpecifierInOverriding
{
    public static void main(String[] args) {
    Dog6 d1 =  new Dog6();
    d1.displayInfo();
    }
}
