package org.esalenko.datastructures.Dequeue;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {

    private class Node {
        private Item value;
        private Node next;
        private Node previous;
    }

    private int size;
    private Node head, tail;

    // construct an empty deque
    public Deque() {

    }

    // is the deque empty?
    public boolean isEmpty() {
        return size == 0;
    }

    // return the number of items on the deque
    public int size() {
        return size;
    }

    // add the item to the front
    public void addFirst(Item item) {

        if (item == null)
            throw new NullPointerException();

        if (head != null) {
            Node oldHead = head;
            Node newHead = new Node();
            newHead.value = item;
            newHead.next = oldHead;
            oldHead.previous = newHead;
            head = newHead;
        } else {
            head = new Node();
            head.value = item;
            tail = head;
        }
        size++;
    }

    // add the item to the end
    public void addLast(Item item) {

        if (item == null)
            throw new NullPointerException();

        if (head != null) {
            Node oldTail = tail;
            Node newTail = new Node();
            newTail.value = item;
            newTail.previous = oldTail;
            oldTail.next = newTail;
        } else {
            head = new Node();
            head.value = item;
            tail = head;
        }
        size++;
    }

    // remove and return the item from the front
    public Item removeFirst() {

        if (isEmpty())
            throw new NoSuchElementException();

        Node item = head;
        head = head.next;
        size--;

        return item.value;
    }

    // remove and return the item from the end
    public Item removeLast() {

        if (isEmpty())
            throw new NoSuchElementException();

        Node item = tail;
        tail = tail.previous;
        size--;

        return item.value;

    }

    // return an iterator over items in order from front to end
    public Iterator<Item> iterator() {

        Iterator<Item> iterator = new Iterator<Item>() {

            Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Item next() {
                if (isEmpty()) throw new NoSuchElementException();
                Item item = current.value;
                current = current.next;
                return item;
            }
        };

        return iterator;
    }

    // unit testing
    public static void main(String[] args) {
//        Deque<Integer> integers = new Deque<>();
//
//        integers.addFirst(1);
//        integers.addLast(7);
//        integers.addFirst(2);
//        integers.removeLast();
//        integers.removeFirst();

        Deque<Integer> deque = new Deque<>();

        deque.addFirst(0);
        deque.addFirst(1);
        deque.addFirst(2);
        deque.isEmpty();
        deque.removeLast(); //     ==> 0
        deque.addFirst(5);
        deque.addFirst(6);
        deque.removeLast();

        System.out.println("Size: " + deque.size());

        for (Integer integer : deque) {
            System.out.println(integer);
        }
    }
}
