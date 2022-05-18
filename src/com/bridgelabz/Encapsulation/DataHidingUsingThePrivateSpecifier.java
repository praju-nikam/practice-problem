package com.bridgelabz.Encapsulation;
class Person{
    // private field
    private int age ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class DataHidingUsingThePrivateSpecifier
{
    public static void main(String[] args) {

      // create an object of Person class
        Person p1 = new Person();

        // Change age using setter
        p1.setAge(28);

        // access age using get
        System.out.println("My age is " +p1.getAge());
    }
}
