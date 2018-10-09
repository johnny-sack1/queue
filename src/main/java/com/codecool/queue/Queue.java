package com.codecool.queue;

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
        return "";
    }

    public String dequeue() {
        return "";
    }

    public int size() {
        return 0;
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
