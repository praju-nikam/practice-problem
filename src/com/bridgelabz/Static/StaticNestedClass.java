package com.bridgelabz.Static;

class MotherBoard{
    // static nested class
    static class USB{
        int usb2 = 2;
        int usb1 = 1;
        int getTotalPorts(){
            return  usb2 + usb1;
        }
    }
}
public class StaticNestedClass {
    public static void main(String[] args) {
        // create an object of the static nested class
        //using the name of the outer class
        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total Ports = " + usb.getTotalPorts());

    }
}
