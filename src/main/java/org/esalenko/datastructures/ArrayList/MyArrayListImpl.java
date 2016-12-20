package org.esalenko.datastructures.ArrayList;

public class MyArrayListImpl<T> implements MyArrayList<T> {

    private Object[] list;
    private int size;

    public MyArrayListImpl() {
        size = 0;
        list = (T[]) new Object[size];
    }

    public MyArrayListImpl(int length) {
        if (length < 0) {
            throw new IllegalArgumentException();
        } else {
            list = (T[]) new Object[length];
            size = length;
        }
    }

    @Override
    public void add(T item) {
        if (list.length == size)
            extensionArray();
        list[size++] = item;
    }

    @Override
    public void insert(int index, T item) {
        if (list.length == size || size < index) {
            extensionArray();
            size++;
        }
        list[index] = item;
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || size < index)
            throw new IllegalArgumentException();

        int shift = index + 1;
        System.arraycopy(list, shift, list, index, size - shift);
        size--;
    }

    @Override
    public int indexOf(T item) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(T item) {
        return indexOf(item) != -1;
    }

    @Override
    public void clear() {
        list = (T[]) new Object[0];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void extensionArray() {
        int newSize = list.length == 0 ? 16 : list.length + 1;
        Object[] newArray = (T[]) new Object[newSize];
        System.arraycopy(list, 0, newArray, 0, list.length);
        list = newArray.clone();
    }

    @Override
    public void copyTo(Object[] array, int index) {
        System.arraycopy(list, 0, array, index, size);
    }

    @Override
    public T get(int index) {
        if (index >= 0 || index < size) {
            return (T) list[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
