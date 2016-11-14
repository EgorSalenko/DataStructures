package org.esalenko.datastructures.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class MyArrayListImplTest {

    private MyArrayList<Integer> list = new MyArrayListImpl<>();

    @Test(timeout = 1000)
    public void add() throws Exception {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test(timeout = 1000)
    public void insert() throws Exception {
        list.insert(0, 1);
        list.insert(2, 2);
        list.insert(4, 4);
        list.insert(6, 4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void remove() throws Exception {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(5);
        System.out.println("=========");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test(timeout = 1000)
    public void indexOf() throws Exception {
        list.insert(0, 2);
        list.insert(1, 3);
        list.insert(2, 1);
        int actual = list.indexOf(1);
        int expected = 2;
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void contains() throws Exception {
        list.insert(0, 2);
        list.insert(1, 3);
        list.insert(2, 1);
        list.insert(3, 5);

        boolean actual = list.contains(3);
        Assert.assertEquals(true, actual);
    }

    @Test
    public void clear() throws Exception {
        list.add(1);
        list.add(1);
        list.add(1);
        list.clear();
        int actual = list.size();
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void size() throws Exception {
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        int actual = list.size();
        int expected = 8;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void copyTo(){
        Integer[] integers = new Integer[0];
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.copyTo(integers, 0);
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
    }
}