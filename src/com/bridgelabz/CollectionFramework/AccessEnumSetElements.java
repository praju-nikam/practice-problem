package com.bridgelabz.CollectionFramework;

import java.util.EnumSet;
import java.util.Iterator;

public class AccessEnumSetElements
{
    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
    public static void main(String[] args) {

        // Creating an EnumSet using allOf()
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);

        Iterator<Size> iterate = sizes.iterator();
        System.out.println("EnumSet : ");
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
            System.out.println(", ");
        }
    }
}
