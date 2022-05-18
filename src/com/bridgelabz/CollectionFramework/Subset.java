package com.bridgelabz.CollectionFramework;

import java.util.HashSet;

public class Subset
{
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("HashSet1 : " +numbers);

        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("HashSet2 : " +primeNumbers);

        // if check primeNumbers is subset of  numbers
        boolean result = numbers.containsAll(primeNumbers);
        System.out.println("Is HashSet2 is SubSet of HashSet1? : " +result);

        // if check numbers is subset of primeNumbers
        boolean result1 = primeNumbers.containsAll(numbers);
        System.out.println("Is HashSet1 is SubSet of HashSet2? : " +result1);
    }
}
