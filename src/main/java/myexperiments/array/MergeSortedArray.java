package myexperiments.array;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] array1 = {4, 6, 8};
        int[] array2 = {0, 1, 2, 12, 34};

        System.out.println(Arrays.toString(mergeAndSort2Arrays(array1, array2)));

    }

    private static int[] mergeAndSort2Arrays(int[] array1, int[] array2) {
        int array1Size = (array1 == null || array1.length == 0) ? 0 : array1.length;
        int array2Size = (array2 == null || array2.length == 0) ? 0 : array2.length;

        if (array1Size == 0 && array2Size == 0) {
            return new int[]{};
        }

        if (array1Size == 0) {
            return array2;
        } else if (array2Size == 0) {
            return array1;
        }

        int[] toReturn = new int[array1Size + array2Size];
        int i = 0;
        int j = 0;
        while (i < array1Size || j < array2Size) {
            if (j < array2Size && i < array1Size) {
                if (array1[i] > array2[j]) {
                    toReturn[i + j] = array2[j];
                    j++;
                } else {
                    toReturn[i + j] = array1[i];
                    i++;
                }
            } else if (i < array1Size) {
                toReturn[i + j] = array1[i];
                i++;
            } else if (j < array2Size) {
                toReturn[i + j] = array2[j];
                j++;
            }
        }

        return toReturn;
    }
}
