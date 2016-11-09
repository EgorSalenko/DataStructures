package org.esalenko.datastructures.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListImplTest {

    private MyLinkedListImpl<Integer> list = new MyLinkedListImpl<Integer>();

    @Test
    public void add() throws Exception {
        list.add(1);
        Integer expected = 1;
        Integer actual = list.getFirst();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void contains() throws Exception {
        list.add(2);
        boolean actual = list.contains(1);
        Assert.assertEquals(false, actual);
    }

    @Test
    public void remove() throws Exception {
        list.add(0);
        boolean actual = list.remove(1);
        Assert.assertEquals(false, actual);
    }

    @Test
    public void indexOf() throws Exception {
        list.add(5);
        Integer actual = list.indexOf(5);
        Integer expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void clear() throws Exception {
        list.add(5);
        list.clear();
        int actual = list.size();
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void element() throws Exception {
        list.add(1);
        Integer actual = list.element();
        Integer expected = 1;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void getFirst() throws Exception {
        list.add(2);
        list.add(3);
        Integer actual = list.getFirst();
        Integer expected = 2;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getLast() throws Exception {
        list.add(2);
        list.add(3);
        Integer actual = list.getLast();
        Integer expected = 3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void isEmpty() throws Exception {
        list.add(1);
        boolean actual = list.isEmpty();
        Assert.assertEquals(false, actual);
    }

}