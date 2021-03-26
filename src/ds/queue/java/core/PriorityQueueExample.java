package ds.queue.java.core;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        /**
         * Queues that we come across in Java follow the FIFO principle.
         *
         * One such exception to this rule is the PriorityQueue.
         * When new elements are inserted into the PriorityQueue, they are ordered based on their natural ordering,
         * or by a defined Comparator provided when we construct the PriorityQueue
         */
        PriorityQueue<String> stringQueue = new PriorityQueue<>();

        stringQueue.add("blueberry");
        stringQueue.add("apple");
        stringQueue.add("cherry");

        String first = stringQueue.poll();
        String second = stringQueue.poll();
        String third = stringQueue.poll();

        System.out.println(first); // apple
        System.out.println(second); // blueberry
        System.out.println(third); // cherry

        System.out.println(stringQueue); // []

    }
}
