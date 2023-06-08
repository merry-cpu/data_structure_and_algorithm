package org.example.LinkedArrayLists;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListArrayList {
    public static void main(String[] args) {

        //*********************Linked List*********************
//        Stores elements as a doubly-linked list. Each element holds references to its previous and next elements.
//        Insertion and removal operations are fast because they only require updating the links. Adding or removing elements at the beginning, middle, or end of the list has similar performance.
//        Index-based access is slower because it requires traversing the list from the beginning to reach the element at a specific index.
//        Memory usage is higher as it requires additional memory to store the links and values for each element.

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }
        startTime = System.nanoTime();
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
//        linkedList.get(0);
        linkedList.get(99999);

        System.out.println("LinkedList:\t " + elapsedTime + " ns");

        //*********************ArrayList**************
//        Provides index-based access to elements, allowing you to quickly access an element at a specific index.
//        The performance of element insertion and removal operations can vary depending on the position of the added or removed element. Appending or removing elements at the end of the list is faster, while inserting or removing elements at the beginning or middle can be slower.
//        Memory usage is based on a predetermined capacity, and when the capacity is reached, a resizing operation is performed.



        long startTime1 = System.nanoTime();
        long endTime1 = System.nanoTime();
        long elapsedTime1 = endTime1 - startTime1;
        arrayList.get(99999);

        System.out.println("ArrayList:\t " + elapsedTime1 + " ns");
    }

//    ArrayList and LinkedList depends on your needs and the requirements of your application:
//    If you frequently need index-based access and rarely perform element insertion or removal, ArrayList might be more suitable.
//    If you frequently perform element insertion or removal, especially at the beginning or middle of the list, LinkedList can be more efficient.
}
