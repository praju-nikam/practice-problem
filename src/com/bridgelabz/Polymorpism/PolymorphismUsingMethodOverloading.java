package com.bridgelabz.Polymorpism;
class Pattern{
    // method without parameter
    public void display(){
        for(int i=0; i<10; i++){
            System.out.println("*");
        }
    }
    // method with single parameter
    public void display(char symbol){
    for(int i=0; i<10; i++){
        System.out.println(symbol);
      }
    }
}
public class PolymorphismUsingMethodOverloading
{
    public static void main(String[] args) {
    // create an object of Pattern class
        Pattern p1 = new Pattern();

        // call without any argument
        p1.display();
        System.out.println("\n");

        // call method with a single argument
        p1.display('#');
    }
}
