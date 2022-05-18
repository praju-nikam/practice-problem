package com.bridgelabz.CollectionFramework;

import java.util.LinkedList;
import java.util.List;

public class ImplementingTheLinkedListClass
{
    public static void main(String[] args) {
        // create list using the linkedList class
        List<Integer> integerList = new LinkedList<>();

        // Add element to the list
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        System.out.println("List : " +integerList);

        // Access element from the list
        int access = integerList.get(2);
        System.out.println("Accessed Element :" +access);

        // using the indexOf() method
        int index = integerList.indexOf(2);
        System.out.println("Position is " + index);

        // Remove element from the list
        int remove = integerList.remove(1);
        System.out.println("Removed Number : " +remove);

        System.out.println("List : " +integerList);
    }
}
