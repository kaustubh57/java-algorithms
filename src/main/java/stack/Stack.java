package stack;

public class Stack<T> {

    private Element<T> top;
    private static final int MAX_SIZE = 5;
    private int size = 0;

    public void push(T data) throws StackOverflowException {
        if (size == MAX_SIZE) {
            throw new StackOverflowException();
        }

        Element<T> topElement = new Element<>(data, this.top);
        this.top = topElement;
        size++;
    }

    public T pop() throws StackUnderFlowException {
        if (size == 0) {
            throw new StackUnderFlowException();
        }

        T topData = this.top.getData();

        this.top = this.top.getNext();

        this.size--;

        return topData;
    }

    public T peek() throws StackUnderFlowException {
        if (size == 0) {
            throw new StackUnderFlowException();
        }
        return this.top.getData();
    }

    public Element<T> getTop() {
        return top;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size == MAX_SIZE;
    }

    public static class Element<T> {
        private Element<T> next;
        private T data;

        Element(T data, Element<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return this.data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Element<T> getNext() {
            return this.next;
        }

        public void setNext(Element<T> next) {
            this.next = next;
        }
    }

    public static class StackOverflowException extends Exception {
    }

    public static class StackUnderFlowException extends Exception {
    }
}
