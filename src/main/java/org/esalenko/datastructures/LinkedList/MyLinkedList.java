package org.esalenko.datastructures.LinkedList;

public class MyLinkedList<T> {

    private Node head;
    private Node tail;
    private int size;

    public void add(T item) {
        addLast(item);
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

    public void iterator() {
        Node current = head;
        while (current != null) {
            current.getValue();
            current = current.getNextValue();
        }
    }

    public int indexOf(T item) {
        Node current = head;

        while (current != null) {
            if (current.getValue().equals(item)) {
                return current.getIndex();
            }
        }

        return -1;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
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

    public void copyTo(Object[] array, int arrayIndex) {
        Node current = head;
        while (current != null) {
            array[arrayIndex++] = current.getValue();
            current = current.getNextValue();
        }
    }

    public int size() {
        return size;
    }

    public void addFirst(T item) {
        Node node = new Node(item);

        Node temp = head;

        head.setNextValue(temp);

        if (size == 0) {
            tail = head;
        } else {
            temp.setPreviousValue(head);
        }

        size++;
    }

    public void addLast(T item) {
        Node node = new Node(item);

        if (size == 0) {
            head = node;
        } else {
            tail.setNextValue(node);
            node.setPreviousValue(tail);
        }

        tail = node;
        size++;
    }

    public void removeFirst() {
        if (size != 0) {
            head = head.getNextValue();
            size--;
            if (size == 0) {
                tail = null;
            } else {
                head.setPreviousValue(null);
            }
        }
    }

    public void removeLast() {
        if (size != 0) {
            if (size == 1) {
                head = null;
                tail = null;
            } else {
                tail.setPreviousValue(tail.getNextValue());
                tail = tail.getPreviousValue();
            }
            size--;
        }
    }

   /* public T get(int index) {
        // Not implemented
    }*/

}
