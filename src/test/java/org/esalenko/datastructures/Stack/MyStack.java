package org.esalenko.datastructures.Stack;

public interface MyStack<T> {

    void push(T item);

    T pop();

    T peek();

    int size();
}
