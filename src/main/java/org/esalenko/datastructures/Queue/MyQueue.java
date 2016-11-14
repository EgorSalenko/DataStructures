package org.esalenko.datastructures.Queue;

public interface MyQueue<T> {

    void enqueue(T item);

    T dequeue();

    T peek();

    int size();
}
