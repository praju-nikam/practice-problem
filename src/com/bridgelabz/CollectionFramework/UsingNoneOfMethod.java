package com.bridgelabz.CollectionFramework;

import java.util.EnumSet;

public class UsingNoneOfMethod {

    // an enum type Size
    enum Size {
        Small, Medium, Large, ExtraLarge
    }
    public static void main(String[] args) {

        // Creating an EnumSet using noneOf()
        EnumSet<Size> sizes = EnumSet.noneOf(Size.class);
        System.out.println("Empty Set : " +sizes);
    }
}
