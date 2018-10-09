package com.codecool.queue;

public class Node {
    private String value;
    private Node next;
    private int priority;

    public Node(String value) {
        this.value = value;
    }

    public Node(String value, int priority) {
        this(value);
        this.priority = priority;
    }

    public String getValue() {
        return this.value;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getPriority() {
        return this.priority;
    }
}
