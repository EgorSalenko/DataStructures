package org.esalenko.datastructures.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyArrayListImplTest {

    private MyArrayList<Integer> list = new MyArrayListImpl<>();
    private List<Integer> integers = new ArrayList<>();

    @Test(timeout = 1000)
    public void add() throws Exception {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        boolean actual = list.contains(1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Assert.assertEquals(actual, true);
    }

    @Test(timeout = 1000)
    public void insert() throws Exception {
        list.insert(0, 1);
        list.insert(2, 2);
        list.insert(4, 4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
//        Assert.assertEquals(actual, true);
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
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        boolean actual = list.contains(5);
        Assert.assertEquals(false, actual);
    }

    @Test
    public void iterator() throws Exception {

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
    public void trim() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.size());
        list.trim();
        System.out.println(list.size());
    }

}