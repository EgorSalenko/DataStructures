package org.esalenko.datastructures.Dequeue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;


import edu.princeton.cs.algs4.StdRandom;

public class RandomizedQueue<Item> implements Iterable<Item> {

    private Item[] items;
    private int size;

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
        int index = getRandomIndex(0);
        Item item = items[index];
        if (index <= items.length) {
            items[index] = items[index++];
        } else if (index == size - 1) {
            items[index] = null;
        }
        else {
            items[index] = items[size - 1];
            items[index] = null;
        }
        if (size == items.length) resize(2 * items.length);
        size--;

        return item;
    }

    private int getRandomIndex(int range) {
        return StdRandom.uniform(range, size);
    }

    // return (but do not remove) a random item
    public Item sample() {
        if (isEmpty()) throw new NoSuchElementException();
        int index = getRandomIndex(0);
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
                if (i == size) throw new NoSuchElementException();
                int index = getRandomIndex(i);
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
}
