package com.bridgelabz.Static;

public class Main {
    public static void main(String[] args) {
     StaticVariable sv = new StaticVariable();
       // Access non-static variable
        System.out.println("Minimum Number = " +sv.minNumber);

        // access the static variable
         System.out.println("Age = "+ StaticVariable.age);
        System.out.println("Maximum Number = " + StaticVariable.maxNumber);

        // create an instance of StaticMethod class
        StaticMethod sm = new StaticMethod();

        // call the non-static method
        System.out.println("Multiply (2 * 2) = " + sm.multiply(2, 2));

        // call the static method
        System.out.println("Addition (2 + 3) = " + StaticMethod.add(2, 3));
    }
}
