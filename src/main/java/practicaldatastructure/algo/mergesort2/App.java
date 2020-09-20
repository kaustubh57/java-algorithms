package practicaldatastructure.algo.mergesort2;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] testData = {5, 2, 6, 1, 50, 3, 0, 56, 243, 8, 1, 1000, 57};

        System.out.println("-- Merge Sort2 --");
        System.out.println("-- Initial data: ");
        System.out.println(Arrays.toString(testData));
        System.out.println("-- Final Output: ");
        System.out.println(Arrays.toString(mergeSort(testData, 0, testData.length - 1)));
    }

    public static int[] mergeSort(int[] a, int startIndex, int lastIndex) {
        if (a.length == 1) {
            return a;
        }

        int middleIndex = (startIndex + lastIndex) / 2;
        int[] lhElements;
        int[] rhElements;

        if (lastIndex - startIndex == 1) {
            lhElements = new int[]{a[startIndex]};
            rhElements = new int[]{a[lastIndex]};
        } else {
            lhElements = new int[a.length - middleIndex - 1];
            rhElements = new int[a.length - lhElements.length];

            for (int i = 0; i < a.length; i++) {
                if (i < lhElements.length) {
                    lhElements[i] = a[i];
                } else {
                    rhElements[i - lhElements.length] = a[i];
                }
            }
        }

        int[] lhSide = mergeSort(lhElements, 0, lhElements.length - 1);
        int[] rhSide = mergeSort(rhElements, 0, rhElements.length - 1);

        return merge(lhSide, rhSide);
    }

    public static int[] merge(int[] lhSide, int[] rhSide) {

        int[] toReturn = new int[lhSide.length + rhSide.length];

        int i = 0;
        int j = 0;

        while (i < lhSide.length) {
            while (j < rhSide.length) {
                if (lhSide[i] <= rhSide[j]) {
                    break;
                } else {
                    toReturn[i + j] = rhSide[j];
                    j++;
                }
            }

            toReturn[i + j] = lhSide[i];
            i++;
        }

        while (j < rhSide.length) {
            toReturn[i + j] = rhSide[j];
            j++;
        }

        return toReturn;
    }
}
