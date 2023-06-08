package org.example;

import java.security.SignedObject;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.LinkedList;
import java.util.Queue;

public class Queque {
    public static void main(String[] args) {

        //FIFO data structure.Fırst in first out(ilk giren ilk çıkar)exp. waiting in line
        //a collection designed for holding elements prior to processing
        //Linear data structure
        //add, remove, element, offer, poll, peek, isEmpty, size
        //add: adds an element to the end of the queue
        //remove: removes an element from the beginning of the queue
        //element: returns the first element of the queue
        //offer: adds and element to the end of the queue
        //poll: removes an element from the beginning of the queue
        //peek: returns the first element of the queue
        //isEmpty: checks if the queue is empty
        //size: returns the size of the queue
        //Queue is an interface
        //Queue is not synchronized
        //Queue is thread safe,slow,legacy
        //Queue is good for single thread
        //Queue is good for FIFO
        //Queue is good for adding/removing elements from the beginning
        //Queue is good for storing data
        //Queue is good for manipulating data
        //Queue is good for priority queues,breadth-first search,caching,sorting,etc.
        //Queue is good for data compression
        //Queue is good for scheduling
        //Queue is good for asynchronous data transfer
        //Queue is good for garbage collection
        //Queue is good for handling interrupts
        //Queue is good for IO buffers,event handling,
        //Queue is good for concurrent programming
        //Queue is good for parallel processing
        //Queue is good for routing,data streaming,simulation,operating systems,network management,traffic management,job scheduling,CPU scheduling,disk scheduling,packet switching,printer spooling,call center systems,operating systems

        Queue<String> queue = new LinkedList<String>();

        queue.add("Karen");
        queue.add("Merve");
        queue.add("Nur");
        queue.add("Doğan");
        queue.offer("jootie");

        System.out.println(queue);

        System.out.println(queue.remove("Doğan"));

        System.out.println(queue);

        System.out.println(queue.element());    //returns the first element of the queue

        System.out.println(queue.peek());   //returns the first element of the queue
        System.out.println(queue.poll());   //removes the first element of the queue
        System.out.println(queue.contains("Merve"));   //checks if the queue contains an element
        System.out.println(queue.isEmpty());   //checks if the queue is empty
        System.out.println(queue.size());   //returns the size of the queue
        System.out.println(queue.toArray());   //converts the queue to an array but returns an object array and location

    }
}
