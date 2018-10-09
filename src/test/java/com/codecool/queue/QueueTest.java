package com.codecool.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private Queue queue;

    @BeforeEach
    void setup() {
        queue = new Queue();
    }

    @Test
    void testEnqueue() {
        queue.enqueue("first");
        queue.enqueue("second");
        queue.enqueue("third");
        String result = " first second third";
        assertEquals(result, queue.toString());
    }

    @Test
    void testPeek() {
        queue.enqueue("first");
        queue.enqueue("second");
        queue.enqueue("third");
        String result = "first";
        assertEquals(result, queue.peek());
    }

    @Test
    void dequeue() {
        queue.enqueue("first");
        queue.enqueue("second");
        queue.enqueue("third");
        queue.dequeue();
        assertEquals("second", queue.peek());
    }

    @Test
    void testSize() {
        queue.enqueue("first");
        queue.enqueue("second");
        queue.enqueue("third");
        queue.dequeue();
        assertEquals(2, queue.size());
    }

    @Test
    void testDequeueWhenEmpty() {
        assertThrows(EmptyStackException.class, () -> queue.dequeue());
    }

    @Test
    void testPriorities() {
        queue.enqueue("first", 2);
        queue.enqueue("second", 3);
        queue.enqueue("third", 1);
        String result = " third first second";
        assertEquals(result, queue.toString());
    }
}
