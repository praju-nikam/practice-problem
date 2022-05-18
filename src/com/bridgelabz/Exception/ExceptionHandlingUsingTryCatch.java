package com.bridgelabz.Exception;

public class ExceptionHandlingUsingTryCatch
{
    public static void main(String[] args) {
        // code that generate exception
        try{
            int divideByZero = 5/0;
            System.out.println("Rest of code in try block");
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException : " +e.getMessage());
        }
    }
}
