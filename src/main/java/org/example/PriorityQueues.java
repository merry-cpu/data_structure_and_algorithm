package org.example;

import java.util.*;

public class PriorityQueues {

    //Priority Queue = A FIFO data structure where each element has a priority
    //Elements with higher priorities are dequeued before elements with lower priorities
    //If two elements have the same priority, they are served according to their order in the queue
    //PriorityQueue is an unbounded queue based on a priority heap
    //The elements of the priority queue are ordered according to their natural ordering, or by a Comparator provided at queue construction time
    //A priority queue does not permit null elements
    //A priority queue relying on natural ordering also does not permit insertion of non-comparable objects
    //The head of this queue is the least element with respect to the specified ordering
    //If multiple elements are tied for least value, the head is one of those elements -- ties are broken arbitrarily
    //The queue retrieval operations poll, remove, peek, and element access the element at the head of the queue
    //It provides O(log(n)) time for the enqueing and dequeing methods (offer, poll, remove() and add)
    //O(n) for the remove(Object) and contains(Object) methods
    //O(1) for the retrieval methods (peek, element, and size)
    //This class and its iterator implement all of the optional methods of the Collection and Iterator interfaces
    //The Iterator provided in method iterator() is not guaranteed to traverse the elements of the priority queue in any particular order
    //If you need ordered traversal, consider using Arrays.sort(pq.toArray())
    //Note that this implementation is not synchronized
    //Multiple threads should not access a PriorityQueue instance concurrently if any of the threads modifies the queue
    //Instead, use the thread-safe PriorityBlockingQueue class
    //Queues are commonly used as a way to reliably transfer objects from one area of a program to another
    //Queues typically, but do not necessarily, order elements in a FIFO (first-in-first-out) manner

    public static void main(String[] args) {

//        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
//
//        queue.offer(3.2);
//        queue.offer(9.8);
//        queue.offer(5.4);
//        queue.offer(1.0);
//        queue.offer(2.0);
//
//        System.out.println(queue);
//
//        while (queue.size() > 0) {
//            System.out.println(queue.peek()); //returns the first element of the queue
//            queue.poll(); //removes the first element of the queue
//        }


        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());


        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");
        queue.offer("F");

        while (!queue.isEmpty()) {

            System.out.println(queue.poll()); //removes the first element of the queue
        }
    }
}
