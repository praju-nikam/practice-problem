package com.bridgelabz.Abstract;
abstract class MotorBike{
    abstract void brake();
}
class SportBike extends MotorBike{
    // implementation of abstract method
    public void brake(){
        System.out.println("SportBike Brake");
    }
}
class MountainBike extends MotorBike{
    // implementation  of abstract method
    public  void brake(){
        System.out.println("MountainBike Brake");
    }
}
public class Abstraction
{
    public static void main(String[] args) {
     MountainBike m1 = new MountainBike();
     m1.brake();
     SportBike s1 = new SportBike();
     s1.brake();
    }
}
