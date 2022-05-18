package com.bridgelabz.CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;

public class AddAllElementsOfSetToArraylist
{
    public static void main(String[] args) {
        // create a set
        HashSet<String> vowels = new HashSet<>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");

        // create an ArrayList
        ArrayList<String> alphabets = new ArrayList<>();

        // add all elements of set to arraylist
        alphabets.addAll(vowels);
        System.out.println("ArrayList : " +alphabets);
    }
}
