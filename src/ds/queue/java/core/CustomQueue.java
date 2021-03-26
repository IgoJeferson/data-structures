package ds.queue.java.core;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * AbstractQueue is the simplest possible Queue implementation that Java provides.
 * It includes a skeletal implementation of some of the Queue interface's methods, excluding offer.
 * When we create a custom queue extending the AbstractQueue class, we must provide an implementation of the offer method which does not
 * allow the insertion of null elements.
 * Additionally, we must provide the methods peek, poll, size, and java.util‘s iterator.
 */
public class CustomQueue<T> extends AbstractQueue<T> {

    private LinkedList<T> elements;

    public CustomQueue() {
        this.elements = new LinkedList<T>();
    }

    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean offer(T t) {
        if (t == null) return false;
        elements.add(t);
        return true;
    }

    @Override
    public T poll() {
        Iterator<T> iter = elements.iterator();
        T t = iter.next();
        if (t != null) {
            iter.remove();
            return t;
        }
        return null;
    }

    @Override
    public T peek() {
        return elements.getFirst();
    }

}