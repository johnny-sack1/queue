package com.codecool.queue;

import java.util.EmptyStackException;

public class Queue {
    private Node head;
    private Node tail;
    private int size;

    public void enqueue(String value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            head = newNode;
            tail = head;
        }
        else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
            tail = current.getNext();
        }
        size++;
    }


    public String peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return head.getValue();
    }

    public String dequeue() {
        String firstItem = peek();
        head = head.getNext();
        size--;
        return firstItem;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        Node current;
        if (!isEmpty()) {
            builder.append(" " + head.getValue());
            current = head;
            while (current.getNext() != null) {
                current = current.getNext();
                builder.append(" " + current.getValue());
            }
        }
        return builder.toString();
    }
}
