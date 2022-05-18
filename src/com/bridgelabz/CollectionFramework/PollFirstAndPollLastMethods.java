package com.bridgelabz.CollectionFramework;

import java.util.TreeSet;

public class PollFirstAndPollLastMethods
{
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet : " +numbers);

        // Using pollFirst() method
        System.out.println("Removed First element : " +numbers.pollFirst());

        // Using pollLast() method
        System.out.println("Removed last element : " +numbers.pollLast());

        System.out.println("New TreeSet : " +numbers);
    }
}
