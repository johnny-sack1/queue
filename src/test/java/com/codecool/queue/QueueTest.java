package com.codecool.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}
