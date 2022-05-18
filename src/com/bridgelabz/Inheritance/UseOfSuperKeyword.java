package com.bridgelabz.Inheritance;
class Animal5{
    public void displayInfo(){
        System.out.println("I am an animal");
    }
}
class Dog5 extends Animal5{
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("I am a dog");
    }
}
public class UseOfSuperKeyword
{
    public static void main(String[] args) {
     Dog5 d1 = new Dog5();
     d1.displayInfo();
    }
}
