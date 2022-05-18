package com.bridgelabz.collections;

import java.util.*;

public class Collection
{
    // Legacy classes like Vector and Stack present since java 1.0 version

    public static void main(String[] args)
    {
        // dynamic array => size of the array is not fixed. It will grow dynamically.

        List<Integer> list = new ArrayList<>(13);
        Integer i1 = new Integer(1); // create object
        list.add(i1); // pass argument object
        list.add(5);
        list.add(8);
        System.out.println("ArrayList 1     : " +list);
        list.remove(2);
        list.add(2,30);
        System.out.println("New ArrayList 1 : " +list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(50);
        list2.add(23);
        list2.add(i1);
        list2.addAll(1,list);
        System.out.println("ArrayList 2     : " +list2);
//        list2.remove(i1);
//        System.out.println("New ArrayList 2 : " +list2);
//        list2.clear();
//        System.out.println("New ArrayList 2 : " +list2);

          list2.set(5,56);  // override the value
        System.out.println("New ArrayList 2 : " +list2);
        list2.removeAll(list);
        System.out.println("Remove list 1 & display New ArrayList 2 : " +list2);

        System.out.println("Last Index of i1 : " +list2.lastIndexOf(i1));
        System.out.println("List is Empty or Not : " +list2.isEmpty());
        System.out.println("Index of i1 : " +list2.indexOf(i1));
        System.out.println("get the value of index 1 : " +list2.get(1));
        System.out.println("check list1 present in list2 : " +list2.containsAll(list)); // check the element list1 present in list2
        System.out.println("New ArrayList 2 : " +list2);
        System.out.println("Check i1=1 present in list2 : "+list2.contains(i1));

        // list maintained insertion order & allowed duplicate value
        list2.add(i1);
        list2.add(5);
        list2.add(30);
        list2.add(5);
        list2.add(i1);
        list2.add(70);
        System.out.println("Display New ArrayList : " +list2);

        //remove the added list2 element Display the list 1 element
        list2.retainAll(list);
        System.out.println("Display New retainAll ArrayList : "+list2);

        //Display the element Between index 0(including) to 2 (2 excluding)
        System.out.println("Display the element Between index 0(including) to 2(2excluding) : " +list2.subList(0,2));

        System.out.println("Display the size of list2 : " +list2.size());


        // In comparator duplication is allowed and insertion order is maintained
        System.out.println("Comparator O/P : ");

        Comparator<Integer> obj1 = new ComparatorSample<>();
        list2.sort(obj1);
        System.out.println(list2);

        for(Integer x : list2)
        {
            System.out.println(x);
        }

        // In Iterator duplication is allowed and insertion order is maintained
        System.out.println("Iterator O/P : ");
        Iterator iterator = list2.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
            iterator.remove();
        }

        System.out.println("ListIterator O/P : ");
        ListIterator listIterator = list2.listIterator();
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
        System.out.println(list2);

       LinkedList<Integer> linkedList = new LinkedList<>();
       linkedList.add(1);
       linkedList.push(4);
       linkedList.add(5);
       linkedList.push(56);
        System.out.println("Linked List : "+linkedList);
        System.out.println("Display the pop element : "+linkedList.pop());
        System.out.println("Linked List : "+linkedList);
        System.out.println("Display the peek element : "+linkedList.peek());
        System.out.println("Linked List : "+linkedList);

       ListIterator listIterator1 = linkedList.listIterator();
        System.out.println("ListIterator : ");
       while (listIterator1.hasNext())
       {
           System.out.println(listIterator1.next());
       }

       Iterator iterator1 = linkedList.iterator();
        System.out.println("Iterator : ");
       while (iterator1.hasNext())
       {
           System.out.println(iterator1.next());
       }

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(8);
        System.out.println("Stack : " +stack);

        // In List duplication is allowed and insertion order is maintained
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(3);
        System.out.println("Array List : " +arrayList);

        // Set does not allow duplicate elements and insertion order is not maintained
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(6);
        hashSet.add(3);
        hashSet.add(7);
        hashSet.add(2);
        System.out.println("HashSet : " +hashSet);

        // In linked hashset insertion order is maintained and duplicates are not allowed
        LinkedHashSet<Integer>linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(100);
        linkedHashSet.add(200);
        linkedHashSet.add(400);
        linkedHashSet.add(600);
        linkedHashSet.add(300);
        linkedHashSet.add(700);
        linkedHashSet.add(600);
        System.out.println("LinkedHashSet : " +linkedHashSet);

        // In TreeSet Duplication not allowed & Insertion order not maintained
        Set<Integer>treeSet = new TreeSet<>();
        treeSet.add(100);
        treeSet.add(200);
        treeSet.add(400);
        treeSet.add(600);
        treeSet.add(300);
        treeSet.add(700);
        treeSet.add(600);
        System.out.println("TreeSet : "+treeSet);

        // In Hash Duplication not allowed in key allowed in values & Insertion order not maintained
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"ABC");
        map.put(5,"DEF");
        map.put(2,"BCA");
        map.put(3,"EFG");
        map.put(4,"EFG");
        System.out.println("HashMap : " +map);

        // In linkedHashMap Duplication not allowed in key, Duplication allowed in values & Insertion order  maintained
        Map<Integer,String>linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "ABC");
        linkedHashMap.put(4, "EFG");
        linkedHashMap.put(5, "ABC");
        linkedHashMap.put(3, "EFG");
        linkedHashMap.put(2, "BCD");
        linkedHashMap.put(5, "BAC");
        System.out.println("LinkedHashMap : "+linkedHashMap);

        // TreeMap : Sorting elements based on keys
        // In TreeMap Duplication not allowed in key, Duplication allowed in values & Insertion order not maintained
        Map<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1, "ABC");
        treeMap.put(4, "EFG");
        treeMap.put(5, "ABC");
        treeMap.put(3, "EFG");
        treeMap.put(2, "BCD");
        treeMap.put(5, "BAC");
        System.out.println("TreeMap : " +treeMap);

        System.out.println("Enumeration : ");
        Enumeration e = Collections.enumeration(list);
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }

        // In Hashtable Duplication not allowed in key ,allowed in values & Insertion order not maintained
        int[] arr = new int[20];
        Hashtable hashtable = new Hashtable<>();
        hashtable.put(1,"ABC");
        hashtable.put(2,"DEF");
        hashtable.put(2, "BCD");
        hashtable.put(4, "BCD");
        hashtable.put(5, "BAC");
        System.out.println("HashTable : " +hashtable);
    }
}
