package practicaldatastructure.algo.mergesort;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        int[] testData = {5, 2, 6, 1, 50, 3, 56, 243, 8, 1, 1000};

        System.out.println("-- Merge Sort --");
        System.out.println("-- Initial data: ");
        System.out.println(Arrays.toString(testData));
        System.out.println("-- Final Output: ");
        System.out.println(Arrays.toString(mergeSort(testData, 0, testData.length - 1)));

    }

    public static int[] mergeSort(int[] a, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return a;
        }

        int middleIndex = (startIndex + endIndex) / 2;
        mergeSort(a, startIndex, middleIndex);
        mergeSort(a, middleIndex + 1, endIndex);

        return merge(a, startIndex, middleIndex, endIndex);
    }

    private static int[] merge(int[] a, int startIndex, int middleIndex, int endIndex) {
        int lhIndex = startIndex;
        int rhIndex = middleIndex + 1;

        while (lhIndex <= middleIndex) {
            rhIndex = middleIndex + 1;

            while (rhIndex <= endIndex) {
                if (a[lhIndex] > a[rhIndex]) {
                    int tempValue = a[lhIndex];
                    a[lhIndex] = a[rhIndex];
                    a[rhIndex] = tempValue;
                    break;
                } else {
                    rhIndex++;
                }
            }
            lhIndex++;
        }

        if (rhIndex <= endIndex) {
            return mergeSort(a, middleIndex + 1, endIndex);
        }

        return a;
    }
}
