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
            head.setIndex(0);
            tail.setIndex(0);
        } else {
            tail.setNextValue(node);
            tail = node;
            tail.setIndex(size);
        }
        size++;
    }

    public boolean contains(T item) {
        Node current = head;
        while (current != null) {
            if (current.getValue().equals(item)) {
                return true;
            }

            current = current.getNextValue();
        }

        return false;
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
        Node current = head;

        while (current != null) {
            if (current.getValue().equals(item)) {
                return current.getIndex();
            }
        }

        return -1;
    }

    public void clear() {
        // Not implemented
    }

    public T element() {
        return (T) head.getValue();
    }

    public T getFirst() {
        if (head == null) {
            throw new NullPointerException();
        }
        return (T) head.getValue();
    }

    public T getLast() {
        return (T) tail.getValue();
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }

   /* public T get(int index) {
        // Not implemented
    }*/

}
