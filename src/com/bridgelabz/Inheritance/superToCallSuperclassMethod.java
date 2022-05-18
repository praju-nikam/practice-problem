package com.bridgelabz.Inheritance;
class Animal8{
   // overriding method

    public void display(){
        System.out.println("I am an animal");
    }
}
class Dog8 extends Animal8{
    // overriding method

    @Override
    public void display() {
        System.out.println("I am a dog");
    }
    public void printMessage(){
        // this call overriding method
        display();

        // this call overriding method
        super.display();
    }
}
public interface superToCallSuperclassMethod
{
    public static void main(String[] args) {
        Dog8 d8 = new Dog8();
      d8.printMessage();
    }
}
