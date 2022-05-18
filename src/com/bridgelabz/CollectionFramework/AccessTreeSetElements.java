package com.bridgelabz.CollectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class AccessTreeSetElements
{
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet : " +numbers);

        // calling iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        System.out.println("TreeSet using Iterator : " +iterate);

        // Accessing Element
        while (iterate.hasNext())
        {
            System.out.println(iterate.next());
            System.out.println(", ");
        }
    }
}
