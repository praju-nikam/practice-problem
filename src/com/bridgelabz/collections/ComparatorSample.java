package com.bridgelabz.collections;

import java.util.Comparator;

public class ComparatorSample<E extends Comparable<E>> implements Comparator<E> {
    @Override

    public int compare(E o1, E o2) {
        if (o1.compareTo(o2) > 1) {
            return 1;
        } else if (o1.compareTo(o2) < 1) {
            return -1;
        } else {
            return 0;
        }

    }
}
