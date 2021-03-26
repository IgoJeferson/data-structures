package ds.queue.java.core;

import java.util.Queue;

public class CustomQueueApp {

    public static void main(String[] args) {

        Queue<Integer> customQueue = new CustomQueue();

        customQueue.add(7);
        customQueue.add(5);

        int first = customQueue.poll();
        int second = customQueue.poll();

        System.out.println(first); // print 7
        System.out.println(second); // print 5


    }
}
