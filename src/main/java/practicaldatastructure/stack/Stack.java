package practicaldatastructure.stack;

import java.lang.reflect.Array;

public class Stack<E> {

    private final int maxSize;
    private final E[] stackArray;
    private int top;

    public Stack(Class<E[]> clazz, int size) {
        this.maxSize = size;
        stackArray = clazz.cast(Array.newInstance(clazz.getComponentType(), size));
        top = -1; //index position
    }

    public void push(E data) {
        if(isFull()) {
            System.out.println("This stack is full!");
            return;
        }
        top++;
        stackArray[top] = data;
    }

    public E pop() {
        if (isEmpty()) {
            System.out.println("This stack is empty!");
            return null;
        }

        E toReturn = stackArray[top];
        top--;
        return toReturn;
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }

        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize-1;
    }
}
