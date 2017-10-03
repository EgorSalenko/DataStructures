package org.esalenko.datastructures.Dequeue;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {

    private class Node {
        private Item value;
        private Node next;
        private Node previous;
    }

    private Node first, last;
    private int size;

    // construct an empty deque
    public Deque() {

    }

    // is the deque empty?
    public boolean isEmpty() {
        return first == null;
    }

    // return the number of items on the deque
    public int size() {
        return size;
    }


    // | null |
    // add(1) = | 1 |
    // add(2) = | 2 | 1 |
    // add(3) = | 3 | 2 | 1 |


    // add the item to the front
    public void addFirst(Item item) {
        if (item == null) throw new IllegalArgumentException();
        if (isEmpty()) first = last;
        Node oldFirst = first;
        first = new Node();
        first.value = item;
        first.next = oldFirst;
        size++;
    }

    // | null |
    //addLast(1) = | 1 |
    //addLast(2) = | 1 | 2 |
    //addLast(3) = | 1 | 2 | 3 |

    // add the item to the end
    public void addLast(Item item) {
        if (item == null) throw new IllegalArgumentException();
        Node oldLast = last;
        last = new Node();
        last.value = item;
        last.previous = oldLast;
        size++;
    }

    // | 1 | 2 | 3 |
    // | 2 | 3 |
    // | 3 |

    // remove and return the item from the front
    public Item removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();
        Item removed = first.value;
        first = first.next;
        size--;

        return removed;
    }

    // remove and return the item from the end
    public Item removeLast() {
        if (isEmpty()) throw new NoSuchElementException();
        Item removed = last.value;
        last = last.previous;
        size--;

        return removed;
    }

    // return an iterator over items in order from front to end
    public Iterator<Item> iterator() {

        Iterator<Item> iterator = new Iterator<Item>() {

            Node current = first;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Item next() {
                if (current == null) throw new NoSuchElementException();
                Item item = current.value;
                current = current.next;
                return item;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };

        return iterator;
    }

    // unit testing
    public static void main(String[] args) {

        Deque<Integer> integers = new Deque<>();


//        integers.addFirst(1);
//        integers.addFirst(2);
//        integers.addFirst(3);
        // | 3 | 2 | 1 |

        integers.addLast(3);
        integers.addLast(2);
        integers.addLast(1);
        // | 3 | 2 | 1 |
        integers.removeLast();
//        integers.removeLast();
        // | 3 | 2 |
//        integers.removeFirst();
//        integers.removeFirst();
        // | 2 |
        for (Integer integer : integers) {
            System.out.print(integer + ", ");
        }
        System.out.println();
        System.out.println("Size : " + integers.size());
    }
}
