package org.esalenko.datastructures.Stack;

import org.esalenko.datastructures.LinkedList.MyLinkedList;
import org.esalenko.datastructures.LinkedList.MyLinkedListImpl;

public class MyStackImpl<T> implements MyStack<T> {

    /**
     * In this case i'm using my own implementation of Linked List
     */
    private MyLinkedList<T> stack = new MyLinkedListImpl<T>();

    @Override
    public void push(T item) {
        stack.addLast(item);
    }

    @Override
    public T pop() {
        checkIsEmpty();
        T last = stack.getLast();
        stack.removeLast();
        return last;
    }

    @Override
    public T peek() {
        checkIsEmpty();
        return stack.getLast();
    }

    @Override
    public int size() {
        return stack.size();
    }

    private void checkIsEmpty() {
        if (stack.size() == 0)
            throw new NullPointerException();
    }
}
