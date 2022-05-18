package com.bridgelabz.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class ImplementationOfIterator
{
    public static void main(String[] args) {
        // creating ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("Array List : " +numbers);

        // creating an instance of Iterator
        Iterator<Integer> iterate = numbers.iterator();

        // Using the next method()
        int number = iterate.next();
        System.out.println("Accessed Element : " +number);

        // Using the remove() method
        iterate.remove();
        System.out.println("Removed Element : " +number);

        System.out.println("Updated Arraylist : ");

        // Using the hasNext() method
        while(iterate.hasNext()){
            // Using the forEachRemaining() method

            iterate.forEachRemaining((value) -> System.out.print(value + ", "));
        }
    }
}
