package ds.queue.java.core;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {

    public static void main(String[] args) {

        /**
         * LinkedList is a pretty standard queue implementation. Elements in the queue are stored internally in a
         * standard linked list data structure. This makes it fast to insert elements at the end (tail) of the list,
         * and remove elements from the beginning (head) of the list.
         */

        // String Queue
        Queue<String> queue = new LinkedList<>();

        // add an element to the end of the Queue, throws an exception if the queue is full
        queue.add("element 1");

        // add an element to the end of the Queue, return false if the Queue is full
        queue.offer("element 2");

        System.out.println(queue);

        // removes the first element in the Queue, return null if the queue is empty
        queue.poll(); // remove element 1
        System.out.println(queue);

        // removes the first element in the Queue, throws exception if the queue is empty
        queue.remove(); // remove element 2
        System.out.println(queue);
        System.out.println(queue.poll());

        queue.add("element 1");
        queue.add("element 2");
        queue.add("element 3");

        /**
         * You can peek at the element at the head of a Queue without taking the element out of the Queue.
         * This is done via the Queue element() or peek() methods.
         */

        // returns the first element in the Queue, throws a NoSuchElementException if the queue is empty
        String firstElement = queue.element();
        System.out.println(firstElement); // element 1

        // returns the first element in the Queue, return null if the queue is empty
        System.out.println(queue.peek()); // element 1

        // Get Queue Size
        System.out.println(queue.size()); // 3

        // Remove Element From Queue
        String removedElement = queue.remove();
        System.out.println(removedElement); // element 1
        System.out.println(queue); // [element 2, element 3]

        // Remove All Elements From Queue
        queue.clear();
        System.out.println(queue); // []

        queue.add("Mazda");

        // Check if Queue Contains Element
        System.out.println(queue.contains("Mazda")); // true
        System.out.println(queue.contains("Honda")); // false

        //access via Iterator
        Iterator<String> iterator = queue.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

        //access via new for-loop
        for(String element : queue) {
            //do something with each element
        }

    }
}
