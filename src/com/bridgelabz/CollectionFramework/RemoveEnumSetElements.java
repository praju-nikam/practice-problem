package com.bridgelabz.CollectionFramework;

import java.util.EnumSet;

public class RemoveEnumSetElements
{
    enum Size{
        SMALL,MEDIUM,LARGE,EXTRALARGE
    }
    public static void main(String[] args) {

        // creating EnumSet using allOf()
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);
        System.out.println("EnumSet : " +sizes);

        // using remove()
        boolean value1 = sizes.remove(Size.MEDIUM);
        System.out.println("Is MEDIUM removed? " +value1);
        System.out.println("EnumSet : " +sizes);


        // using removeAll()
        boolean value2 = sizes.removeAll(sizes);
        System.out.println("Are all elements removed? " +value2);
        System.out.println("EnumSet : " +sizes);

    }
}
