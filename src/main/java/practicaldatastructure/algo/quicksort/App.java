package practicaldatastructure.algo.quicksort;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] testData = {5, 2, 6, 1, 50, 3, 56, 243, 8, 1, 1000};

        System.out.println("-- Quick Sort --");
        System.out.println("-- Initial data: ");
        System.out.println(Arrays.toString(testData));
        System.out.println("-- Final Output: ");
        System.out.println(Arrays.toString(quickSort(testData, 0, testData.length - 1)));
    }

    public static int[] quickSort(int[] a, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return a;
        }

        int pivotIndex = getPivotIndex(a, startIndex, endIndex);

        quickSort(a, startIndex, pivotIndex - 1);
        quickSort(a, pivotIndex + 1, endIndex);

        return a;
    }

    private static int getPivotIndex(int[] a, int startIndex, int endIndex) {
        int pivotIndex = startIndex;
        int pivotElement = a[endIndex];

        for (int i = startIndex; i < endIndex; i++) {
            if (a[i] <= pivotElement) {
                if (i - pivotIndex > 0) {
                    swapArrayElement(a, pivotIndex, i);
                }
                pivotIndex++;
            }
        }

        if (a[endIndex] < a[pivotIndex]) {
            swapArrayElement(a, pivotIndex, endIndex);
        }
        return pivotIndex;
    }

    private static void swapArrayElement(int[] a, int positionA, int positionB) {
        int tempValue = a[positionA];
        a[positionA] = a[positionB];
        a[positionB] = tempValue;
    }
}
