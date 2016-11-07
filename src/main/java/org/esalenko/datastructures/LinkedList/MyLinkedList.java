package org.esalenko.datastructures.LinkedList;

import java.util.LinkedList;

public class MyLinkedList<T> {

    private Node head;
    private Node tail;
    private int size;

    public void add(T item) {
        Node node = new Node(item);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNextValue(node);
            tail = node;
        }
        size++;
    }

    public boolean contains(T item) {
        boolean result = false;

        Node node = new Node(item);

        LinkedList list = new LinkedList();
        list.
        return result;
    }

    public boolean remove(T item) {
        Node previous = null;
        Node current = head;

        while (current != null) {

            if (current.getValue().equals(item)) {

                if (previous != null) {
                    previous.setNextValue(current.getNextValue());
                    if (current.getNextValue() == null) {
                        tail = previous;
                    }

                } else {
                    head = head.getNextValue();
                    if (head == null) {
                        tail = null;
                    }
                }

                size--;
                return true;
            }
            previous = current;
            current = current.getNextValue();
        }

        return false;
    }

    public int indexOf(T item) {
        // Not implemented
    }

    public void clear() {
        // Not implemented
    }

    public T element() {
        // Not implemented
    }

    public T getFirst() {
        // Not implemented
    }

    public T getLast() {
        // Not implemented
    }

    public boolean isEmpty() {
        // Not implemented
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        // Not implemented
    }

}
