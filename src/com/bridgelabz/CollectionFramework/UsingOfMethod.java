package com.bridgelabz.CollectionFramework;

import java.util.EnumSet;

public class UsingOfMethod
{
    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    public static void main(String[] args) {

        // Using of() with a single parameter
        EnumSet<Size> sizes = EnumSet.of(Size.MEDIUM);
        System.out.println("EnumSet1 : " +sizes );
        EnumSet<Size> sizes1 = EnumSet.of(Size.SMALL,Size.LARGE);
        System.out.println("EnumSet2 : " +sizes1 );
    }
}
