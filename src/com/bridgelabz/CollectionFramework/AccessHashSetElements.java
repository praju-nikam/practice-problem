package com.bridgelabz.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class AccessHashSetElements
{
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("HashSet : " +numbers);

        // Calling iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        System.out.println("Hashset using iterator : ");

        // Accessing elements
        while(iterate.hasNext()){
            System.out.println(iterate.next());
            System.out.println(" , ");
        }
    }
}
