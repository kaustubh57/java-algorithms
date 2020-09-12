package v2.stack;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class V2Stack<T> {

    private int maxSize;
    private T[] stackArray;
    private int top;

    public V2Stack(int size) {
        this.maxSize = size;
        this.stackArray = (T[])new Object[maxSize];
        this.top = -1;
    }

    public void push(T j) {
        if (isFull()) {
            log.error("the stack is already full");
        } else {
            top++;
            stackArray[top] = j;
        }
    }

    public T pop() {
        if (isEmpty()) {
            log.error("the stack is already empty");
            throw new RuntimeException("Stack is empty");
        } else {
            int oldTop = top;
            top--;
            return stackArray[oldTop];
        }
    }

    public T peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return maxSize - 1 == top;
    }

}
