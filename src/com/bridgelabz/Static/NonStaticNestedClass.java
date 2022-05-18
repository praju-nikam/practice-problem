package com.bridgelabz.Static;

    class CPU{
        double price;
        //nested class
        class Processor{
            // member of nested class
            double cores;
            String manufacture;
            double getCache(){
                return 4.3;
            }
        }
        // nested protected class
        protected class  RAM{
            // member of nested protected class
            double memory;
            String manufacture;
            double getClockSpeed(){
                return 5.5;
            }
        }
    }
public class NonStaticNestedClass {
    public static void main(String[] args) {
        // create object of outer class CPU
        CPU cpu = new CPU();

        // create an object of inner class processor using outer class
        CPU.Processor processor = cpu.new Processor();

        // create an object of inner class RAM using outer class
        CPU.RAM ram = cpu.new RAM();

        System.out.println("Processor Cache = "+processor.getCache());
        System.out.println("Ram Clock Speed = " +ram.getClockSpeed());
    }
}
