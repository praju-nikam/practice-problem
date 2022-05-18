package com.bridgelabz.CollectionFramework;

import java.util.EnumSet;

public class UsingAllOfMethod
{
    // an enum named size
    enum Size{
        Small,Medium,Large,ExtraLarge
    }
    public static void main(String[] args) {
      // creating an EnumSet using allOf()
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);
        System.out.println("EnumSet : " +sizes );
    }
}
