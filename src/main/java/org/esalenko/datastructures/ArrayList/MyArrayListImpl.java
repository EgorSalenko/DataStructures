package org.esalenko.datastructures.ArrayList;

public class MyArrayListImpl<T> implements MyArrayList<T> {

    private Object[] array;
    private int size;

    public MyArrayListImpl(int length) {
        if (length > 0) {
            throw new IllegalArgumentException("Length more then 0");
        } else {
            array = (T[]) new Object[length];
            size = length;
        }
    }

    @Override
    public void add(T item) {
        if (array.length == size) {
            extensionArray();
        }
        array[size++] = item;
    }

    @Override
    public void insert(int index, T item) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (array.length == size) {
            extensionArray();
        }
        Object[] newArray = new Object[size];
        System.arraycopy(array, 0, newArray, array.length, size);

        newArray[index] = item;
        size++;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int indexOf(T item) {
        return 0;
    }

    @Override
    public boolean contains(T item) {
        return false;
    }

    @Override
    public void iterator() {

    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void extensionArray() {
        size = (size * 3) / 2 + 1;
    }
}
