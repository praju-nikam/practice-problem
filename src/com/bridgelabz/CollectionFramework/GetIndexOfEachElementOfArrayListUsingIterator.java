package com.bridgelabz.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class GetIndexOfEachElementOfArrayListUsingIterator
{
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        // Add element in the ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("HTML");

        // Create a variable of Iterator
        // store the iterator returned by iterator()
        Iterator<String> iterate = languages.iterator();
        System.out.println("Element : Index" );

        // loop through ArrayList till it has all elements
        // Use methods of Iterator to access elements
        while(iterate.hasNext()){
            // access Element
            String element = iterate.next();
            System.out.println(element + ": ");

            // Access of index each element
            System.out.println(languages.indexOf(element));
        }

    }


}
