package com.bridgelabz.CollectionFramework;

import java.util.ArrayList;

public class CreateArrayList
{
    public static void main(String[] args) {
        // create ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("HTML");
        arrayList.add("JavaScript");
        System.out.println(" Array List : " +arrayList);

        // add C++ at index 3
        arrayList.add(3,"C++");
        System.out.println(" Array List : " +arrayList);

    }
}
