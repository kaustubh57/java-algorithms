package queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unchecked")
class QueueTest {

    @Test
    void isEmpty() {
        //Given
        Queue queue = new Queue(Integer.class);

        //When
        final boolean isEmpty = queue.isEmpty();
        final boolean isFull = queue.isFull();

        //Then
        assertTrue(isEmpty);
        assertFalse(isFull);
    }

    @Test
    void isFull() {
        //Given
        Queue queue = new Queue(Integer.class);

        //When
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        queue.enqueue(400);
        queue.enqueue(500);

        queue.dequeue();
        queue.enqueue(600);

        final boolean isEmpty = queue.isEmpty();
        final boolean isFull = queue.isFull();

        //Then
        assertTrue(isFull);
        assertFalse(isEmpty);
    }

    @Test
    void enqueueAndDequeue() {
        //Given
        Queue queue = new Queue(Integer.class);

        //When
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        queue.enqueue(400);
        queue.enqueue(500);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.enqueue(600);
        queue.enqueue(700);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        final boolean isEmpty = queue.isEmpty();
        final boolean isFull = queue.isFull();

        //Then
        assertTrue(isEmpty);
        assertFalse(isFull);
    }

    @Test
    void enqueueAndDequeue02() {
        //Given
        Queue queue = new Queue(Integer.class);

        //When
        queue.enqueue(100);
        queue.dequeue();

        final boolean isEmpty = queue.isEmpty();
        final boolean isFull = queue.isFull();

        //Then
        assertTrue(isEmpty);
        assertFalse(isFull);
    }

    @Test
    void enqueueAndDequeue03() {
        //Given
        Queue queue = new Queue(Integer.class);

        //When
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        queue.enqueue(400);
        queue.enqueue(500);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.enqueue(600);
        queue.enqueue(700);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        final boolean isEmpty = queue.isEmpty();
        final boolean isFull = queue.isFull();

        //Then
        assertFalse(isEmpty);
        assertFalse(isFull);
    }

    @Test
    void enqueueQueueOverflowException() {
        //Given
        Queue queue = new Queue(Integer.class);

        //Then
        assertThrows(Queue.QueueOverflowException.class, () -> {
            //When
            queue.enqueue(100);
            queue.enqueue(200);
            queue.enqueue(300);
            queue.enqueue(400);
            queue.enqueue(500);
            queue.enqueue(600);
        });
    }

    @Test
    void enqueueQueueUnderflowException() {
        //Given
        Queue queue = new Queue(Integer.class);

        //Then
        assertThrows(Queue.QueueUnderflowException.class, () -> {
            //When
            queue.dequeue();
        });

        //Then
        assertThrows(Queue.QueueUnderflowException.class, () -> {
            //When
            queue.enqueue(100);
            queue.enqueue(200);
            queue.enqueue(300);
            queue.enqueue(400);
            queue.enqueue(500);

            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
        });
    }

}
