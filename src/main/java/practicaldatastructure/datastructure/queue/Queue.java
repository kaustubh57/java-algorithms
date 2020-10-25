package practicaldatastructure.datastructure.queue;

public class Queue {

    private static final int EMPTY_DATA_CONSTANT = -999;

    private final int maxSize;
    private final long[] queueArray;
    private int frontIndex;
    private int rearIndex;
    private int totalItems;

    public Queue(int size) {
        this.maxSize = size;
        queueArray = new long[size];
        frontIndex = 0;
        rearIndex = -1;
        totalItems = 0;
    }

    public void push(long data) {
        if (isFull()) {
            System.out.println("Queue is full; can't insert new item!");
            return;
        }

        if (rearIndex == maxSize - 1) {
            rearIndex = 0;
        } else {
            rearIndex++;
        }

        totalItems++;
        queueArray[rearIndex] = data;
    }

    public long pop() {
        if (isEmpty()) {
            System.out.println("Queue is empty; can't pop new item!");
            return -1;
        }

        long toReturn = queueArray[frontIndex];
        queueArray[frontIndex] = EMPTY_DATA_CONSTANT;
        if (frontIndex == maxSize - 1) {
            frontIndex = 0;
        } else {
            frontIndex++;
        }
        totalItems--;

        if (isEmpty()) {
            rearIndex = -1;
            frontIndex = 0;
        }

        return toReturn;
    }

    public long peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty; nothing to peek!");
            return -1;
        }

        return queueArray[frontIndex];
    }

    public boolean isEmpty() {
        return totalItems == 0;
    }

    public boolean isFull() {
        return totalItems == maxSize;
    }

    public void view() {
        System.out.print("[");
        for (int i = 0; i < queueArray.length; i++) {
            System.out.print("(" + i + ")" + queueArray[i] + " : ");
        }
        System.out.println("]");
    }

    public void viewIndexPosition() {
        System.out.println("frontIndex = " + frontIndex);
        System.out.println("rearIndex = " + rearIndex);
    }

}
