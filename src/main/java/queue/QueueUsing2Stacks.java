package queue;

import stack.Stack;

public class QueueUsing2Stacks<T> {

    public boolean isFull() {
        return false;
    }

    public boolean isEmpty() {
        return false;
    }

    public void enqueue(T data) throws Queue.QueueOverflowException, Stack.StackOverflowException, Stack.StackUnderFlowException {

    }

    public T dequeue() throws Queue.QueueUnderflowException, Stack.StackOverflowException, Stack.StackUnderFlowException {
        return null;
    }
}
