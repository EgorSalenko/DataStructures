package org.esalenko.datastructures.LinkedList;

public class Node {

    private int index;
    private Object value;
    private Node nextValue;

    public Node(Object value) {
        this.value = value;
    }

    public Node(int index, Object value) {
        this.index = index;
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNextValue() {
        return nextValue;
    }

    public void setNextValue(Node nextValue) {
        this.nextValue = nextValue;
    }
}
