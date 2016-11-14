package org.esalenko.datastructures.Queue;

import org.esalenko.datastructures.LinkedList.MyLinkedList;
import org.esalenko.datastructures.LinkedList.MyLinkedListImpl;

public class MyQueueImpl<T> implements MyQueue<T> {

    /**
     * In this case i'm using my own implementation of Linked List
     */
    private MyLinkedList<T> queue = new MyLinkedListImpl<T>();

    @Override
    public void enqueue(T item) {
        queue.addFirst(item);
    }

    @Override
    public T dequeue() {
        checkIsEmpty();

        T last = queue.getLast();
        queue.removeLast();
        return last;
    }

    @Override
    public T peek() {
        checkIsEmpty();

        return queue.getLast();
    }

    @Override
    public int size() {
        return queue.size();
    }

    private void checkIsEmpty() {
        if (queue.size() == 0)
            throw new NullPointerException("The queue is empty");
    }
}
