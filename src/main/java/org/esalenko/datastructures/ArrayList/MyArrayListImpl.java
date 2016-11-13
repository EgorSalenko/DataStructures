package org.esalenko.datastructures.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListImpl<T> implements MyArrayList<T> {

    private Object[] srcArray;
    private int size;

    List<Integer> integerList = new ArrayList<>();

    public MyArrayListImpl() {
        size = 0;
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

    @Override
    public void add(T item) {
        if (srcArray.length == size)
            extensionArray();
        srcArray[size++] = item;
    }

    @Override
    public void insert(int index, T item) {
        if (srcArray.length == size || size < index) {
            extensionArray();
            size++;
        }
        srcArray[index] = item;
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || size < index) {
            throw new IllegalArgumentException();
        }
        int shift = index + 1;
        System.arraycopy(srcArray, shift, srcArray, index, size - shift);
        size--;
    }

    @Override
    public int indexOf(T item) {

        for (int i = 0; i < srcArray.length; i++) {
            if (srcArray[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

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
        int newSize = srcArray.length == 0 ? 16 : srcArray.length + 1;
        Object[] newArray = (T[]) new Object[newSize];
        System.arraycopy(srcArray, 0, newArray, 0, srcArray.length);
        srcArray = newArray.clone();
    }

    @Override
    public void copyTo(T[] array, int index) {
        System.arraycopy(srcArray, 0, array, index, srcArray.length);
    }

    @Override
    public T get(int index) {
        if (index >= 0 || index < size) {
            return (T) srcArray[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void trim() {
        if (srcArray.length != size) {
            Object[] tempArray = (T[]) new Object[size];
            System.arraycopy(srcArray, 0, tempArray, 0, tempArray.length);
        }
    }
}
