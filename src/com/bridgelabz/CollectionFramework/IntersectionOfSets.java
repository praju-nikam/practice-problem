package com.bridgelabz.CollectionFramework;

import java.util.HashSet;

public class IntersectionOfSets
{
    public static void main(String[] args) {
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("HashSet1 : " +primeNumbers);

        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet2 : " +evenNumbers);

        // Insertion of 2 sets
        evenNumbers.retainAll(primeNumbers);
        System.out.println("Insertion is : " +evenNumbers);
    }
}
