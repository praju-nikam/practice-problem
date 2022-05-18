package com.bridgelabz.Inheritance;
class Animal11{
    // default or no-arg constructor
    Animal11(){
        System.out.println("I am an animal");
    }
    // Parameterised Constructor
    Animal11(String type){
        System.out.println("Type : "+type);
    }
}
class Dog11 extends Animal11{
    // default constructor
    Dog11(){
        // calling parameterised constructor of the super class
        super("Animal");
        System.out.println("I am a dog");
    }

}
public class CallParameterizedConstructorUsingSuper
{
    public static void main(String[] args) {
     Dog11 d11 = new Dog11();
    }
}
