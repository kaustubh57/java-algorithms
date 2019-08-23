package sort;

public class BubbleSort<T> {

    private T[] elements;

    BubbleSort(T[] elements) {
        this.elements = elements;
    }

    public T[] getElements() {
        return elements;
    }

    public void print(T[] list) {
        System.out.println("Print elements...");
    }

    public void swap(T[] list, int iIndex, int jIndex) {
        System.out.println("Swap elements...");
    }

    public void sort() {
        System.out.println("Sort elements...");
    }
}
