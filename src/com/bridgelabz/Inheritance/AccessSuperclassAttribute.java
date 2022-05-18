package com.bridgelabz.Inheritance;
class Animal9{
   protected String type = "animal";
}
class Dog9 extends Animal9{
    public String type = "mammal";
    public void printType(){
        System.out.println("I am a " +type);
        System.out.println("I am an "+super.type);
    }
}
public class AccessSuperclassAttribute
{
    public static void main(String[] args) {
      Dog9 d9 = new Dog9();
      d9.printType();
    }
}
