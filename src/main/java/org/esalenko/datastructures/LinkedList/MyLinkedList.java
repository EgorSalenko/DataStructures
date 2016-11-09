package org.esalenko.datastructures.LinkedList;

public interface MyLinkedList<T> {

    void add(T item);

    boolean contains(T item);

    boolean remove(T item);

    void iterator();

    int indexOf(T item);

    void clear();

    T element();

    T getFirst();

    T getLast();

    boolean isEmpty();

    void copyTo(Object[] array, int arrayIndex);

    int size();

    void addFirst(T item);

    void addLast(T item);

    void removeFirst();

    void removeLast();

}
