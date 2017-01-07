package org.esalenko.datastructures.Dequeue;

import java.util.Iterator;
import java.util.Random;

public class RandomizedQueue<Item> implements Iterable<Item> {

    private Item[] array;
    private int size;

    // construct an empty randomized queue
    public RandomizedQueue() {
        array = (Item[]) new Object[1];
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
        if (size == array.length) resize(2 * array.length);
        array[size++] = item;
    }

    // remove and return a random item
    public Item dequeue() {
        Random random = new Random();
        int index = random.nextInt(size);
        Item removed = array[index];
        array[index] = null;
        return removed;
    }

    // return (but do not remove) a random item
    public Item sample() {
        Random random = new Random();
        int index = random.nextInt(size);
        return array[index];
    }

    // return an independent iterator over items in random order
    public Iterator<Item> iterator() {
        Iterator<Item> iterator = new Iterator<Item>() {

            int i = 0;

            @Override
            public boolean hasNext() {
                return i != size;
            }

            @Override
            public Item next() {
                return array[i++];
            }
        };
        return iterator;
    }

    // resize dynamic array if need more capacity
    private void resize(int capacity) {
        Item[] copy = (Item[]) new Object[capacity];
        for (int i = 0; i < size; i++)
            copy[i] = array[i];
        array = copy;
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
        System.out.println(integers.sample());
        integers.dequeue();
        System.out.println(integers.isEmpty());

        System.out.println("Size: " + integers.size());

        for (Integer integer : integers)
            System.out.println(integer);

    }
}
