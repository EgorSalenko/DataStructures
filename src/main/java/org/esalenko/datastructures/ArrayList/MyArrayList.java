package org.esalenko.datastructures.ArrayList;

public interface MyArrayList<T> {

    void add(T item);

    void insert(int index, T item);

    void remove(int index);

    int indexOf(T item);

    boolean contains(T item);

    T iterator();

    void clear();

    int size();

    void extensionArray();

    void copyTo(T[] array, int index);

    T get(int index);
}
