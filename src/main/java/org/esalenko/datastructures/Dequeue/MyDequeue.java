package org.esalenko.datastructures.Dequeue;

public interface MyDequeue<T> {

    void enqueueFirst(T item);

    void enqueueLast(T item);

    T dequeueFirst();

    T dequeueLast();

    T peekFirst();

    T peekLast();

    int size();
}
