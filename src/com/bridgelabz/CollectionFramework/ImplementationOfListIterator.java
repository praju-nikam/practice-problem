package com.bridgelabz.CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ImplementationOfListIterator
{
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("Array List : " +numbers);

        // creating of instance of ListIterator
        ListIterator<Integer> iterate = numbers.listIterator();

        // Using the next() method
        int number1 = iterate.next();
        System.out.println("Next Element : " +number1);

        // Using the nextIndex() method
        int index1 = iterate.nextIndex();
        System.out.println("Position of next element : " +index1);

        // Using hasNext() method
        System.out.println("Is there any next element? : " +iterate.hasNext());
        System.out.println("Array List : " +numbers);

    }
}
