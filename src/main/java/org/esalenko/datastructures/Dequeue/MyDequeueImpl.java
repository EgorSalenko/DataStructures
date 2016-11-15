package org.esalenko.datastructures.Dequeue;

import org.esalenko.datastructures.LinkedList.MyLinkedList;
import org.esalenko.datastructures.LinkedList.MyLinkedListImpl;

public class MyDequeueImpl<T> implements MyDequeue<T> {

    /**
     * In this case i'm using my own implementation of Linked List
     */
    private MyLinkedList<T> dequeue = new MyLinkedListImpl<T>();

    @Override
    public void enqueueFirst(T item) {
        dequeue.addFirst(item);
    }

    @Override
    public void enqueueLast(T item) {
        dequeue.addLast(item);
    }

    @Override
    public T dequeueFirst() {
        checkIsEmpty();
        T first = dequeue.getFirst();
        dequeue.removeFirst();

        return first;
    }

    @Override
    public T dequeueLast() {
        checkIsEmpty();
        T last = dequeue.getLast();
        dequeue.removeLast();

        return last;
    }

    @Override
    public T peekFirst() {
        checkIsEmpty();
        return dequeue.getFirst();
    }

    @Override
    public T peekLast() {
        checkIsEmpty();
        return dequeue.getLast();
    }

    @Override
    public int size() {
        return dequeue.size();
    }

    private void checkIsEmpty() {
        if (dequeue.size() == 0)
            throw new NullPointerException("Dequeue is empty");
    }
}
