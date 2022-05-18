package com.bridgelabz.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaArrayListIterator
{
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        // Add element in ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("HTML");

        // create a variable for iterator
        // store the iterator returned by iterator()
        Iterator<String> iterate = languages.iterator();
        System.out.println("ArrayList : " );

        // loop through ArrayList till it has all elements
        // Use methods of Iterator to access elements

        while (iterate.hasNext()){
            System.out.println(iterate.next());
            System.out.println(" , ");
        }
    }
}
