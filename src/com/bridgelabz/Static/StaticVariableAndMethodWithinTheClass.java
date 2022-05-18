package com.bridgelabz.Static;

public class StaticVariableAndMethodWithinTheClass {

    // static variable
    static int age;

    // static method
    static void display() {
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        // Access the static variable
        age = 20;
        System.out.println("Age = " +age);

        // Access the static Method
        display();

    }
}
