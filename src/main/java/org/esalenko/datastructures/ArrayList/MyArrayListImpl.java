package org.esalenko.datastructures.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListImpl<T> implements MyArrayList<T> {

    private Object[] srcArray;
    private int size;
    private static int BASIC_SIZE = 0;

    List<T> list = new ArrayList<T>();

    public MyArrayListImpl() {
        size = BASIC_SIZE;
        srcArray = (T[]) new Object[size];
    }

    public MyArrayListImpl(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length more then 0");
        } else {
            srcArray = (T[]) new Object[length];
            size = length;
        }
    }

    /**
     * Add an item to the end of array
     * @param item the generic data you need to add in array
     * Algorithm complexity is even O(1)
     */
    @Override
    public void add(T item) {
        if (srcArray.length == size) {
            extensionArray();
        }
        srcArray[size++] = item;
    }

    /**
     * Insert an item by the index to array
     * @param index an index in array where need to add an item
     * @param item the generic data you need to add in array
     * Algorithm complexity O(1)
     */
    @Override
    public void insert(int index, T item) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (srcArray.length == size) {
            extensionArray();
        }

        System.arraycopy(srcArray, index, srcArray, index + 1, size - index);
        srcArray[index] = item;
        size++;
    }

    /**
     * Remove an item by the index
     * @param index position in current array
     */
    @Override
    public void remove(int index) {
        if (index < 0 || size < index) {
            throw new IllegalArgumentException();
        }
        System.arraycopy(srcArray, index, srcArray, index - 1, size - 1);
        size--;
    }

    /**
     * Get the index of item
     * @param item the generic data which index you need
     * @return index of item if it exist in array, or -1 if item not found
     */
    @Override
    public int indexOf(T item) {

        for (int i = 0; i < srcArray.length; i++) {
            if (srcArray[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Check array on contains of item
     * @param item the generic data which need to check on contains
     * @return true if item(s) is found, or false if not found
     */
    @Override
    public boolean contains(T item) {
        for (int i = 0; i < srcArray.length; i++) {
            if (srcArray[i].equals(item)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public T iterator() {
        T temp = null;
        for (int i = 0; i < srcArray.length; i++) {
            temp = (T) srcArray[i];
        }

        return temp;
    }

    @Override
    public void clear() {
        srcArray = (T[]) new Object[0];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void extensionArray() {
        int newSize = (int) (size * 3) + 2 - 1;
        Object[] newArray = (T[]) new Object[newSize];
        System.arraycopy(srcArray, 0, newArray, 0, srcArray.length);
        srcArray = newArray;
    }

    @Override
    public void copyTo(T[] array, int index) {
        System.arraycopy(srcArray, 0, array, index, size);
    }

    @Override
    public T get(int index) {
        for (int i = 0; i < srcArray.length; i++) {
            if (i == index) {
                return (T) srcArray[i];
            }
        }
        return null;
    }
}
