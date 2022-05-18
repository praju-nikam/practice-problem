package com.bridgelabz.java8features;

// Java 1.8 version braught many features with it like functional interfaces, lambda expressions, streams api ,etc......
// Functional programming :- benefit of reducing the code(number of lines of code).
// Java 8 features

// Functional interface (has single Abstract method)
// Lambda expressions
// streams api(uses lambda)

@FunctionalInterface
interface IMathFunction{

    int x = 0;
    int calculate(int x,int y);
    default void m1(){

    }
    static void m2(int x,int y, String function,IMathFunction iMathFunction){
        System.out.println(function+"=> "+ x + " & "+ y +" = "+iMathFunction.calculate(x,y));
    }
}


public class MainClass1 {

    public static void main(String[] args) {
        IMathFunction add = (x, y) -> x+y ;
        IMathFunction multiply = (x, y) -> x*y;
        IMathFunction divide = (x, y) -> x/y;

//        System.out.println("Add :" +add.calculate(1,4));
//        System.out.println("Multiply :" +multiply.calculate(5,7));
//        System.out.println("Divide :" +divide.calculate(4,2));

        IMathFunction.m2(1,4,"Add",add);
        IMathFunction.m2(5,7,"Multiply",multiply);
        IMathFunction.m2(4,2,"Divide",divide);
    }
}
