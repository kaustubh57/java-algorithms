package myexperiments.array;

import lombok.ToString;

import java.util.Arrays;

@ToString
class MyArrayList {

    private int size;
    private int[] array;

    public MyArrayList(final int size) {
        this.size = 0;
        this.array = new int[size];
        Arrays.fill(array, -1);
    }

    public int getSize() {
        return size;
    }

    public void push(int item) {
        if (this.size == this.array.length) {
            return;
        }

        this.array[size] = item;
        size++;
    }

    public void pop() {
        if (size == 0) {
            return;
        }

        this.array[size - 1] = -1;
        size--;
    }

    public void remove(int index) {
        if (index >= size) {
            return;
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[size-1] = -1;
        size--;
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(5);
        System.out.println(myArrayList);

        myArrayList.push(5);
        myArrayList.push(23);
        myArrayList.push(2);
        System.out.println(myArrayList);

        myArrayList.pop();
        System.out.println(myArrayList);

        myArrayList.push(57);
        myArrayList.push(100);
        myArrayList.remove(1);
        System.out.println(myArrayList);

        myArrayList.remove(0);
        System.out.println(myArrayList);
    }

}
