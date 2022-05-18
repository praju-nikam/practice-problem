package com.bridgelabz.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ImplementingTheArrayListClass
{
    public static void main(String[] args) {
        //  creating list using  the ArrayList Class
        List<Integer> numbers = new ArrayList<>();

        // Add Elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(" List : " +numbers);

        // Access elements from the list
        int number = numbers.get(2);
        System.out.println("Accessed Element : " +number);

        // Remove element from the list
        int removeNumber = numbers.remove(1);
        System.out.println("Removed Number : " +removeNumber);

        System.out.println("List: " + numbers);
    }
}
