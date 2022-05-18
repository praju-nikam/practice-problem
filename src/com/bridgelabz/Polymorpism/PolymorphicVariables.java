package com.bridgelabz.Polymorpism;
class ProgrammingLanguage
{
    public void display(){
        System.out.println("I am Programming Language");
    }
}
class Java1 extends ProgrammingLanguage{
    @Override
    public void display() {
        System.out.println("I am Object-Oriented Programming Language");
    }
}
public class PolymorphicVariables
{
    public static void main(String[] args) {
        // declare an object variable
        ProgrammingLanguage pl = new ProgrammingLanguage();;

        //create object of ProgrammingLanguage
        pl.display();

        // create object of Java Class
        Java1 j1 = new Java1();
        j1.display();
    }
}
