package org.esalenko.datastructures.Queue;

import org.junit.Assert;
import org.junit.Test;

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
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(6);

        Integer actual = queue.dequeue();
        Integer expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void peek() throws Exception {
        queue.enqueue(51);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);

        Integer actual = queue.peek();
        Integer expected = 51;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void size() throws Exception {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        int actual = queue.size();
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }

}