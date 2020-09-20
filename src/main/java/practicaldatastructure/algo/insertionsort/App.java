package practicaldatastructure.algo.insertionsort;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] testData = {5, 2, 6, 1, 50, 3, 56, 243, 8, 1};

        System.out.println("-- My try with recursion --");
        System.out.println(Arrays.toString(insertionSort_myTry_recursion(testData, 0)));
        System.out.println("------------------");

        System.out.println(Arrays.toString(insertionSort(testData)));

    }

    public static int[] insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int element = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > element) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = element;
        }
        return a;
    }

    public static int[] insertionSort_myTry_recursion(int[] a, int pivot) {
        if (pivot == a.length - 1) {
            return a;
        } else if (a[pivot] < a[pivot + 1] || a[pivot] == a[pivot + 1]) {
            return insertionSort_myTry_recursion(a, pivot + 1);
        } else {
            int[] arrayToSort = new int[a.length];
            int insertedIndex = -1;

            for (int i = 0; i < pivot + 1; i++) {
                if (a[i] > a[pivot + 1]) {
                    arrayToSort[i] = a[pivot + 1];
                    insertedIndex = i;
                    break;
                } else {
                    arrayToSort[i] = a[i];
                }
            }

            for (int k = insertedIndex; k < pivot + 1; k++) {
                arrayToSort[k + 1] = a[k];
            }


            for (int j = pivot + 2; j < a.length; j++) {
                arrayToSort[j] = a[j];
            }

            return insertionSort_myTry_recursion(arrayToSort, pivot + 1);
        }
    }
}
