package stack;

public class MinimumStack {

    private Stack<Integer> originalStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();


    public void push(Integer value) {
        originalStack.push(value);
        if (minStack.isEmpty() || minStack.peek() > value) {
            minStack.push(value);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public Integer pop() {
        minStack.pop();
        return originalStack.pop();
    }

    public Integer peek() {
        return originalStack.peek();
    }

    public int getSize() {
        return originalStack.getSize();
    }

    public Integer getMinimumValue() {
        return minStack.peek();
    }
}
