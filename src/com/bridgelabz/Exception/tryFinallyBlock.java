package com.bridgelabz.Exception;

public class tryFinallyBlock
{
    public static void main(String[] args) {
        try{
            int divideByZero = 5/0;
        }
        finally {
            System.out.println("Finally block is always executed");
        }
    }
}
