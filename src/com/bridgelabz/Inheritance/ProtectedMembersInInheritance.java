package com.bridgelabz.Inheritance;

class Animal3{
    protected String name;
    protected void display(){
        System.out.println("I am an animal");
    }
}
class Dog3 extends Animal3{
    public void getInfo(){
        System.out.println("My name is " +name);
    }
}
public class ProtectedMembersInInheritance
{
    public static void main(String[] args) {
   // create an object of subclass
        Dog3 labrador = new Dog3();

        // access protected field & method using the object of subclass
        labrador.name = "Rocky";
        labrador.display();
        labrador.getInfo();
    }
}
