package com.bridgelabz.Exception;

public class ExceptionHandlingUsingFinallyBlock
{
    public static void main(String[] args) {
        try{
            // code that generates exception
            int divideByZero = 5/0;
            }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException : " +e.getMessage());
        }
        finally {
            System.out.println("This is the Finally Block");
        }
    }
}