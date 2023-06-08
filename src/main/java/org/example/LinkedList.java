package org.example;

public class LinkedList {
    public static void main(String[] args) {

        //LinkedList = stores Nodes in 2 parts(data + address of the next node)
        //Nodes are linked usingpointers
        //                       Elements are linked using pointers

        //                             Singly Linked List
        //                     Node                    Node               Node
        //                [data | address] ->  [data | address] ->  [data | address]

        //                             Doubly Linked List
        //                     Node                          Node                           Node
        //        [address| data | address] <->  [address| data | address]  <->  [address| data | address]


        //Dynamic data structure (allocates needed memory while running)
        // 1.Insertion 2.Deletion 3.Searching 4.Sorting 5.Traversing
        // 2.Insertion and Deletion are faster than ArrayList and Nodes is easy
        // No/Low memory waste
        //Disadvantages: 1. Greater memory usages(Extra memory for pointers) 2. No random access (no index [i] 3. Nodes are stored incontiguously in memory(No cache friendly)4.Accessing searching elements is more time consuming O(n) 5. Not thread safe
        //uses of linked lists:implement Stacks/Queues,Gps navigation, music player, image viewer, undo/redo features in text editors, moving back/forward button in web browsers, backtracking algorithms(maze, finding shortest path, etc.), call stack in programming languages(calling methods), stack data structure itself
        //LinkedList is a linear data structure and collection its not synchronized,thread safe, slow, legacy
        //LinkedList is good for single thread,manipulating data,storing data, data compression, scheduling, asynchronous data transfer, garbage collection, handling interrupts
        //LinkedList is good for adding/removing elements from the beginning/end
        //LinkedList is good for IO buffers,event handling,concurrent programming,parallel processing,routing,data streaming,simulation,operating systems,network management,traffic management,job scheduling,CPU scheduling,disk scheduling,packet switching,printer spooling,call center systems,operating systems
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<>();

//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("E");
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("E");

       linkedList.add(4,"F");

       linkedList.poll();//en baştaki elementi siler

        linkedList.remove(); //en baştaki elementi siler

        System.out.println(linkedList.peekFirst()); //en baştaki elementi gösterir

        System.out.println(linkedList.peekLast()); //en sondaki elementi gösterir

        System.out.println(linkedList.pollFirst()); //en baştaki elementi siler

        System.out.println(linkedList.pollLast()); //en sondaki elementi siler


        System.out.println(linkedList.getFirst());

        linkedList.addFirst("Merve");
        linkedList.addLast("Nur");
        System.out.println(linkedList);
//        System.out.println(linkedList.pop()); //removes the first element of the list
//        System.out.println(linkedList);
//
//        System.out.println(linkedList.peek()); //returns the first element of the list
//        System.out.println(linkedList);
//        System.out.println(linkedList.poll()); //removes the first element of the list
//        System.out.println(linkedList);
//        System.out.println(linkedList.contains("Merve")); //checks if the list contains an element
//        System.out.println(linkedList);

    }

}
