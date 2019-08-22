package queue;

import java.lang.reflect.Array;

public class Queue<T> {

    private static final int MAX_SIZE = 5;
    private T[] elements;

    private static final int INITIAL_INDEX_VALUE = -1;
    private int headIndex = INITIAL_INDEX_VALUE;
    private int tailIndex = INITIAL_INDEX_VALUE;

    //TODO: peek,

    @SuppressWarnings("unchecked")
    Queue(Class<T> clazz) {
        elements = (T[]) Array.newInstance(clazz, MAX_SIZE);
    }

    public boolean isEmpty() {
        return headIndex == INITIAL_INDEX_VALUE;
    }

    public boolean isFull() {
        int nextIndex = (tailIndex + 1) % MAX_SIZE;
        return nextIndex == this.headIndex;
    }

    public void enqueue(T newElement) {
        if (isFull()) {
            throw new QueueOverflowException();
        }

        if (isEmpty()) {
            headIndex = 0;
            tailIndex = 0;
        } else {
            tailIndex = (tailIndex + 1) % MAX_SIZE;
        }

        elements[tailIndex] = newElement;
    }


    public T dequeue() {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        }

        T headValue = elements[headIndex];
        elements[headIndex] = null;

        if (headIndex == tailIndex) {
            headIndex = tailIndex = INITIAL_INDEX_VALUE;
        } else {
            headIndex = (headIndex + 1) % MAX_SIZE;
        }

        return headValue;
    }


    public static class QueueOverflowException extends RuntimeException {
    }

    public static class QueueUnderflowException extends RuntimeException {
    }
}
