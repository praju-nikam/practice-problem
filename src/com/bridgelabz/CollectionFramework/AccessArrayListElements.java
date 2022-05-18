package com.bridgelabz.CollectionFramework;

import java.util.ArrayList;

public class AccessArrayListElements
{
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        // Add element into ArrayList
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");
        animals.add("Horse");
        System.out.println("Array List : " +animals);

        // get the element from the arrayList
        String str = animals.get(1);
        System.out.println("Elements of index 1 : " +str);
    }
}
