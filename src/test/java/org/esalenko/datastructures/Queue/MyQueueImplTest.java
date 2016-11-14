package org.esalenko.datastructures.Queue;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyQueueImplTest {

    private MyQueue<Integer> queue = new MyQueueImpl<>();

    @Test
    public void enqueue() throws Exception {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        Integer actual = queue.peek();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void dequeue() throws Exception {

    }

    @Test
    public void peek() throws Exception {

    }

    @Test
    public void size() throws Exception {

    }

}