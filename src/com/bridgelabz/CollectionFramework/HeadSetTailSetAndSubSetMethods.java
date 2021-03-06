package com.bridgelabz.CollectionFramework;

import java.util.TreeSet;

public class HeadSetTailSetAndSubSetMethods
{
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet : " +numbers);


        // Using headSet() with default boolean value
        System.out.println("Using headSet without boolean value : " + numbers.headSet(5));

        // Using headSet() with specified boolean value
        System.out.println("Using headSet with boolean value : " +numbers.headSet(5,true));


        // Using tailSet() with default boolean value
        System.out.println("Using tailSet without boolean value: " + numbers.tailSet(4));

        // Using tailSet() with specified boolean value
        System.out.println("Using tailSet with boolean value: " + numbers.tailSet(4, false));

    }
}
