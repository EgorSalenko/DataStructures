package org.esalenko.datastructures.Dequeue;

import org.junit.Assert;
import org.junit.Test;

public class MyDequeueImplTest {

    MyDequeue<Integer> dequeue = new MyDequeueImpl<>();

    @Test
    public void enqueueFirst() throws Exception {
        dequeue.enqueueFirst(1);
        dequeue.enqueueFirst(3);
        dequeue.enqueueFirst(5);

        Integer actual = dequeue.peekFirst();
        Integer expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void enqueueLast() throws Exception {
        dequeue.enqueueLast(3);
        dequeue.enqueueLast(2);
        dequeue.enqueueLast(1);

        Integer actual = dequeue.peekLast();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dequeueFirst() throws Exception {
        dequeue.enqueueFirst(1);
        dequeue.enqueueFirst(3);
        dequeue.enqueueFirst(5);

        Integer actual = dequeue.dequeueFirst();
        Integer expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dequeueLast() throws Exception {
        dequeue.enqueueFirst(1);
        dequeue.enqueueFirst(3);
        dequeue.enqueueFirst(5);

        Integer actual = dequeue.dequeueLast();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void peekFirst() throws Exception {
        dequeue.enqueueFirst(1);
        dequeue.enqueueFirst(2);
        dequeue.enqueueFirst(3);
        dequeue.enqueueFirst(4);

        Integer actual = dequeue.peekFirst();
        Integer expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void peekLast() throws Exception {
        dequeue.enqueueFirst(1);
        dequeue.enqueueFirst(2);
        dequeue.enqueueFirst(3);
        dequeue.enqueueFirst(4);

        Integer actual = dequeue.peekLast();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void size() throws Exception {
        dequeue.enqueueFirst(1);
        dequeue.enqueueFirst(2);
        dequeue.enqueueFirst(3);
        dequeue.enqueueFirst(4);

        int actual = dequeue.size();
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

}