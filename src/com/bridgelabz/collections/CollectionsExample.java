package com.bridgelabz.collections;

import java.util.*;

public class CollectionsExample {

    // Legacy classes like Vector and Stack present since java 1.0 version
    public static void main(String[] args) {

        // dynamic array => size of the array is not fixed. It will grow dynamically.
        List<Integer> list = new ArrayList<>(13);
        Integer i1 = new Integer(1);
        list.add(i1);
        list.add(5);
        list.add(8);

        list.remove(2);
        list.add(2, 30);
        List<Integer> list2 = new ArrayList<>();
        list2.add(50);
        list2.add(23);
        list2.add(i1);
        list2.addAll(1, list);
//        list2.remove(i1);
//        list2.clear();


        list2.set(5, 56);
        list2.removeAll(list);
        System.out.println(list2.lastIndexOf(i1));
        System.out.println(list2.isEmpty());

        System.out.println(list2.indexOf(i1));
        System.out.println(list2.get(1));
        System.out.println(list2.containsAll(list));
        System.out.println(list2.contains(i1));
        System.out.println(list);
        System.out.println(list2);
        list2.add(i1);
        list2.add(5);
        list2.add(30);
        list2.add(5);
        list2.add(i1);
        list2.add(70);
        list2.retainAll(list);
        System.out.println(list2);
//        System.out.println(list2.subList(0, 2));
        System.out.println(list2.size());

        ComparatorSample<Integer> obj1 = new ComparatorSample();
        list2.sort(obj1);
        System.out.println(list2);

        for (Integer x : list2) {
            System.out.println(x);
        }


        System.out.println("Iterator o/p");
        Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            // cursors
            System.out.println(iterator.next());
            iterator.remove();
        }

        ListIterator listIterator = list2.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        LinkedList<Integer> linkedList1 = new LinkedList();
        linkedList1.add(1);
        linkedList1.push(4);
        linkedList1.add(5);
        linkedList1.push(56);
        System.out.println(linkedList1.pop());
        System.out.println(linkedList1);
        System.out.println(linkedList1.peek());
        System.out.println(linkedList1);

        ListIterator listIterator1 = linkedList1.listIterator();
        while (listIterator1.hasNext()) {
            System.out.println(listIterator1.next());
        }

        Iterator iterator1 = linkedList1.iterator();
        while (iterator1.hasNext()) {
            // cursors
            System.out.println(iterator1.next());
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(1);

        System.out.println("**********************************");
        // In List duplication is allowed and insertion order is maintained
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(3);
        System.out.println(arrayList);

        // Set does not allow duplicate elements and insertion order is not maintained
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(6);
        hashSet.add(3);
        hashSet.add(7);
        hashSet.add(2);
        System.out.println(hashSet);

        // In linked hashset insertion order is maintained and duplicates are not allowed
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(100);
        linkedHashSet.add(200);
        linkedHashSet.add(400);
        linkedHashSet.add(600);
        linkedHashSet.add(300);
        linkedHashSet.add(700);
        linkedHashSet.add(600);
        System.out.println(linkedHashSet);
        System.out.println("Tree Set");
        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(100);
        treeSet.add(200);
        treeSet.add(400);
        treeSet.add(600);
        treeSet.add(300);
        treeSet.add(700);
        treeSet.add(600);
        System.out.println(treeSet);
        System.out.println();

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "ABC");
        map.put(2, "BCD");
        map.put(3, "EFG");
        map.put(4, "EFG");
        System.out.println(map);

        System.out.println("Tree Map");
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
       // TreeMap : Sorting elements based on keys
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "ABC");
        treeMap.put(4, "EFG");
        treeMap.put(3, "EFG");
        treeMap.put(2, "BCD");
        treeMap.put(5, "BAC");

        System.out.println(treeMap);

        Enumeration e = Collections.enumeration(list);
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        int[] ar= new int[20];
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(1,"ABC");
        hashtable.put(2,"BCD");
        System.out.println(hashtable);

        // null values concept in collections and map

    }
}
