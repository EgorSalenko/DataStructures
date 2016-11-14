package org.esalenko.datastructures.Stack;

import org.junit.Assert;
import org.junit.Test;

public class MyStackImplTest {

    private MyStack<String> stack = new MyStackImpl<>();

    @Test
    public void push() throws Exception {
        stack.push("First plate");
        stack.push("Second plate");
        stack.push("Third plate");

        String expected = "Third plate";
        String actual = stack.peek();
        System.out.println(expected);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void pop() throws Exception {
        stack.push("First plate");
        stack.push("Second plate");
        stack.push("Third plate");

        String actual = stack.pop();
        String expected = "Third plate";
        Assert.assertEquals(expected, actual);

        int actualSize = stack.size();
        int expectedSize = 2;
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void peek() throws Exception {
        stack.push("First plate");
        stack.push("Second plate");
        stack.push("Third plate");

        String expected = "Third plate";
        String actual = stack.peek();
        Assert.assertEquals(expected, actual);

        int actualSize = stack.size();
        int expectedSize = 3;
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void size() throws Exception {
        stack.push("First plate");
        stack.push("Second plate");
        stack.push("Third plate");

        int actual = stack.size();
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

}