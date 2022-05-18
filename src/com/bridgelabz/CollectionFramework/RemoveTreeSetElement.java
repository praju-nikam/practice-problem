package com.bridgelabz.CollectionFramework;

import java.util.TreeSet;

public class RemoveTreeSetElement
{
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet : " +numbers);

        // using remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 is removed? " +value1);
        System.out.println("TreeSet : " +numbers);


        // using removeAll() method
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? "+value2);
        System.out.println("TreeSet : " +numbers);

    }
}
