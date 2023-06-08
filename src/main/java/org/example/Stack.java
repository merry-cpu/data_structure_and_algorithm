package org.example;

public class Stack {
    public static void main(String[] args) {

        //LIFO
        //push, pop, peek, search, isEmpty, size
        //push: adds an element to the top of the stack
        //pop: removes an element from the top of the stack
        //peek: returns the top element of the stack
        //search: returns the position of an element in the stack
        //isEmpty: checks if the stack is empty
        //size: returns the size of the stack
        //Stack is a subclass of Vector class
        //Stack is synchronized, Vector is not
        //Stack is thread safe, Vector is not
        //Stack is slow, Vector is fast
        //Stack is legacy, Vector is not
        //Stack is good for single thread, Vector is good for multi thread
        //Stack is good for LIFO, Vector is good for random access
        //Stack is good for adding/removing elements from the end, Vector is good for adding/removing elements from anywhere
        //Stack is good for storing data, Vector is good for manipulating data
        java.util.Stack<String> stack = new java.util.Stack<>();

        stack.push("Hello");
        stack.push("World");
        stack.push("Merve");
        stack.push("Nur");
        stack.push("Doğan");

        stack.pop();


        System.out.println("Stack is empty: " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack: " + stack);

        System.out.println(stack.search("Merve"));

        //uses of stacks :
        //1. undo/redo features in text editors
        //2. moving back/forward button in web browsers
        //3. backtracking algorithms(maze, finding shortest path, etc.)
        //4. call stack in programming languages(calling methods)
        //5. stack data structure itself

    }
}