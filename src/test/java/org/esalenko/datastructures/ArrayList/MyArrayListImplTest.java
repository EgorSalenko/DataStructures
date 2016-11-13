package org.esalenko.datastructures.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListImplTest {

    private MyArrayList<Integer> list = new MyArrayListImpl<>();

    @Test
    public void add() throws Exception {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        boolean actual = list.contains(1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Assert.assertEquals(actual, true);
    }

    @Test
    public void insert() throws Exception {
        list.insert(0, 1);
        boolean actual = list.contains(1);
        Assert.assertEquals(actual, true);
    }

    @Test
    public void remove() throws Exception {
        list.add(1);
        list.remove(0);
        int actual = list.indexOf(1);
        int expected = -1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void indexOf() throws Exception {

    }

    @Test
    public void contains() throws Exception {

    }

    @Test
    public void iterator() throws Exception {

    }

    @Test
    public void clear() throws Exception {

    }

    @Test
    public void size() throws Exception {

    }

    @Test
    public void extensionArray() throws Exception {

    }

}