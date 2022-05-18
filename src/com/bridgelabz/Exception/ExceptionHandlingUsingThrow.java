package com.bridgelabz.Exception;

public class ExceptionHandlingUsingThrow
{
    public static void divideByZero() {
        // throw an exception
        throw new ArithmeticException("Trying to divide by 0 ");
    }
    public static void main(String[] args) {

        divideByZero();
    }
}
