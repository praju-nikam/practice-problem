package com.bridgelabz.Static;

public class StaticBlock 
{
    //static variables
    static int a = 20;
    static int b;
    static int max;

    //static blocks
    static{
        System.out.println("First static block");
        b= a * 4;
    }
    static {
        System.out.println("Second static block");
        max = 30;

    }
    //static Method
    static void display(){
        System.out.println("a= "+a);
        System.out.println("b= " +b);
        System.out.println("max = " +max);
    }

    public static void main(String[] args) {
        // calling the static method
        display();
    }
}

