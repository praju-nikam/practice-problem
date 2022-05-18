package com.bridgelabz.CollectionFramework;

import java.util.EnumSet;

public class InsertElementsToEnumSet
{
    enum Size{
        SMALL,MEDIUM,LARGE,EXTRALARGE
    }

    public static void main(String[] args) {

        // Creating an EnumSet using allOf()
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);

      // Creating an EnumSet using noneOf()
        EnumSet<Size> sizes1 = EnumSet.noneOf(Size.class);


        // Creating an EnumSet using noneOf()
        sizes1.add(Size.MEDIUM);
        EnumSet<Size> sizes2 = EnumSet.noneOf(Size.class);

        // Using add method
        sizes1.add(Size.MEDIUM);
        System.out.println("EnumSet Using add(): " + sizes1);

        // Using addAll() method
        sizes1.addAll(sizes);
        System.out.println("EnumSet Using addAll(): " + sizes1);

    }
}
