package sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeSortTest {

    @Test
    void additionOfElementsWithRecursion() {
        //Given
        int[] elements = {10, 1, 5, 8, 3};

        //When
        int total = MergeSort.additionOfElementsWithRecursion(elements, 0, elements.length - 1);

        //Then
        assertEquals(27, total);
    }

    @Test
    void additionOfElementsWithRecursionBetweenNumbers() {
        //Given
        int[] elements = {10, 1, 5, 8, 3};

        //When
        int total = MergeSort.additionOfElementsWithRecursion(elements, 2, elements.length - 1);

        //Then
        assertEquals(16, total);
    }

    @Test
    void mergeSortSingleElement() {
        //Given
        int[] elements = {29};

        //When
        MergeSort.mergeSort(elements);

        //Then
        assertArrayEquals(new int[]{29}, elements);
    }

    @Test
    void mergeSortTwoElements() {
        //Given
        int[] elements = {29, 18};

        //When
        MergeSort.mergeSort(elements);

        //Then
        assertArrayEquals(new int[]{18, 29}, elements);
    }

    @Test
    void mergeSortExample1() {
        //Given
        int[] elements = {10, 1, 5, 8, 3};

        //When
        MergeSort.mergeSort(elements);

        //Then
        assertArrayEquals(new int[]{1, 3, 5, 8, 10}, elements);
    }

    @Test
    void mergeSortExample2() {
        //Given
        int[] elements = {3, 5, 6, 8, 10, 1, 2, 4, 7, 9};

        //When
        MergeSort.mergeSort(elements);

        //Then
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, elements);
    }


}
