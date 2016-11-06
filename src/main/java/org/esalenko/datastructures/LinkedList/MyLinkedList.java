package org.esalenko.datastructures.LinkedList;

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
            size++;
        }

    }

    public boolean contains(T item) {
        boolean result = false;

        return result;
    }

    public void remove(T item) {

    }
}
