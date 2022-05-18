package com.bridgelabz.CollectionFramework;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ImplementingTreeSetClass
{
    public static void main(String[] args) {
        // create a set using the TreeSet class
        Set<Integer> numbers = new TreeSet<>();

        // Add  element in to the set
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        System.out.println("Set using TreeSet : " +numbers);

        // Access elements using iterator()
        System.out.println("Accessing element using iterator() : " );
        Iterator<Integer> iterate = numbers.iterator();
        while (iterate.hasNext()){
            System.out.println(iterate.next());
            System.out.println(" , ");
        }
    }
}
