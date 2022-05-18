package com.bridgelabz.CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class ImplementingHashSetClass
{
    public static void main(String[] args) {
        // creating a set using the HashSet Class
        Set<Integer> set1 = new HashSet<>();

        // Add element in to the set1
        set1.add(2);
        set1.add(3);
        System.out.println("Set1 : " +set1);

        // creating another set using HashSet Class
        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        System.out.println("Set2 : " +set2);

        // union of 2 sets
        set2.addAll(set1);
        System.out.println("Union is : " +set2);
    }
}
