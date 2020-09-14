package practicaldatastructure.algo.selectionsort;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] testData = {5, 2, 6, 1, 50, 3, 56, 243, 8};

        System.out.println(Arrays.toString(selectionSort(testData, 0)));
    }

    public static int[] selectionSort(int a[], int startIndex) {
        if (startIndex == a.length - 1) {
            return a;
        }

        for (int i = startIndex + 1; i < a.length; i++) {
            if (a[startIndex] > a[i]) {
                int tempValue = a[startIndex];
                a[startIndex] = a[i];
                a[i] = tempValue;
            }
        }

        return selectionSort(a, startIndex + 1);
    }
}
