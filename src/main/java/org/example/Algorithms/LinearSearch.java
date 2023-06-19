package org.example.Algorithms;

public class LinearSearch {
    //linear search = Iterate through a collection one element at a time

    //runtime complexity = O(n)
    //disadvantage = slow for large data sets
    //advantage = fast for searches small data sets
    //          = Does not need to be sorted
    //          = useful for data structures that do not have random access(Linked List)
    public static void main(String[] args) {
        int[] array = { 8, 7, 2, 1, 0, 9, 6 ,32,12};

        int index = linearSearch(array, 2);

        if (index == -1)
            System.out.println("Element is not found in the array");
        else
            System.out.println("Element found at position " + index);
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            //if the element is found, return the index
            if (array[i] == key) {
                return i;
            }
        }
        //return -1 if the element is not found
        return -1;
    }
}
