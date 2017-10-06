package org.esalenko.datastructures.Dequeue;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class RandomizedQueue<Item> implements Iterable<Item> {

    private Item[] items;
    private int size;

    private Random random = new Random();

    // construct an empty randomized queue
    public RandomizedQueue() {
        items = (Item[]) new Object[1];
    }

    // is the queue empty?
    public boolean isEmpty() {
        return size == 0;
    }

    // return the number of items on the queue
    public int size() {
        return size;
    }

    // add the item
    public void enqueue(Item item) {
        if (item == null) throw new IllegalArgumentException();
        if (size == items.length) resize(2 * items.length);
        items[size++] = item;
    }

    // remove and return a random item
    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException();
        int index = getRandomIndex();
        Item item = items[index];
        items[index] = null;
        size--;
        if (size == items.length) resize(2 * items.length);

        return item;
    }

    private int getRandomIndex() {
        return random.nextInt(size);
    }

    // return (but do not remove) a random item
    public Item sample() {
        if (isEmpty()) throw new NoSuchElementException();
        int index = getRandomIndex();
        return items[index];
    }

    // return an independent iterator over items in random order
    public Iterator<Item> iterator() {
        Iterator<Item> iterator = new Iterator<Item>() {

            int i = 0;

            @Override
            public boolean hasNext() {
                return i < size;
            }

            @Override
            public Item next() {
                int index = getRandomIndex();
                i++;
                return items[index];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

        };

        return iterator;
    }

    // resize dynamic array if need more capacity
    private void resize(int capacity) {
        Item[] newItemsArray = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, newItemsArray, 0, size);
        items = newItemsArray;
    }

    // unit testing (optional)
    public static void main(String[] args) {

        RandomizedQueue<Integer> integers = new RandomizedQueue<>();
        integers.enqueue(1);
        integers.enqueue(2);
        integers.enqueue(3);
        integers.enqueue(4);
        integers.enqueue(5);
        System.out.println();
        System.out.println("Get random item: " + integers.sample());
        integers.dequeue();
        System.out.println("isEmpty: " + integers.isEmpty());

        System.out.println("Size: " + integers.size());

        for (Integer integer : integers)
            System.out.println(integer);

    }
}
