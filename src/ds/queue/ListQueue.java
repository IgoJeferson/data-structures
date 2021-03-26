package ds.queue;

import java.util.ArrayList;
import java.util.List;

public class ListQueue<X> implements Queue<X> {
    private List<X> data;
    private int front;
    private int end;

    public ListQueue(){
        this(1000);
    }

    public ListQueue(int size){
        this.front = -1;
        this.end = -1;
        data = new ArrayList(size);
    }

    public int size(){
        // if the queue is empty return 0
        if(front == -1 && end == -1){
            return 0;
        }
        // otherwise we add one to get the inclusive subtraction value rather than excluding
        else {
            return end - front + 1; //inclusive math justify the + 1 operation
        }
    }

    public void enQueue(X item){
        // check to see if any items have been added to the queue yet
        if(size() == 0){
            front++;
            end++;
            data.add(end, item);
        }
        // otherwise add the item to the end of the queue
        else {
            end++;
            data.add(end, item);
        }
    }

    public X deQueue(){
        X item = null;

        // if the queue is empty we can't dequeue anything
        if(size() == 0){
            throw new IllegalStateException("Can't dequeue because the queue is empty!");
        }
        // otherwise is this is the last item on the queue, the queue needs to get reset to empty
        else if (front == end){
            item = data.get(front);
            data.set(front, null); // for garbage collection purposes
            front = -1;
            end = -1;
        }
        // otherwise grab the front of the queue, return it and adjust the front pointer
        else {
            item = data.get(front);
            data.set(front, null); // for garbage collection purposes
            front ++;
        }

        return item;
    }

    // linear performance O(n)
    public boolean contains(X item){
        boolean found = false;

        // if the queue is empty just immediately return false
        if(size() == 0) {
            return found;
        }
        return data.contains(item);

//        for(int i = front; i < end; i++){
//            if(data.get(i).equals(item)){
//                found = true;
//                break;
//            }
//        }

//        return found;

    }

    // linear performance O(n)
    public X access(int position){
        if(size() == 0 || position > size()) {
            throw new IllegalArgumentException("No items in the queue or the position is greater than the queue size.");
        }

        return this.data.get(position);

        /*int trueIndex = 0;
        for(int i = front; i < end; i++){
            if (trueIndex == position){
                return data[i];
            }
            trueIndex++;
        }

        // if we didn't find the item throw an exception
        throw new IllegalArgumentException("Could not get queue item at position: " + position);*/

    }

}
