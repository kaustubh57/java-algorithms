package sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuickSortTest {

    @Test
    void quickSortSingleElement() {
        //Given
        int[] elements = {29};

        //When
        QuickSort.quickSort(elements, 0, elements.length - 1);

        //Then
        assertArrayEquals(new int[]{29}, elements);
    }

    @Test
    void quickSortTwoElements() {
        //Given
        int[] elements = {29, 18};

        //When
        QuickSort.quickSort(elements, 0, elements.length - 1);

        //Then
        assertArrayEquals(new int[]{18, 29}, elements);
    }

    @Test
    void quickSortExample1() {
        //Given
        int[] elements = {10, 1, 5, 8, 3};

        //When
        QuickSort.quickSort(elements, 0, elements.length - 1);

        //Then
        assertArrayEquals(new int[]{1, 3, 5, 8, 10}, elements);
    }

    @Test
    void quickSortExample2() {
        //Given
        int[] elements = {3, 5, 6, 8, 10, 1, 2, 4, 7, 9};

        //When
        QuickSort.quickSort(elements, 0, elements.length - 1);

        //Then
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, elements);
    }

    @Test
    void quickSortExample3() {
        //Given 1,2,3
        int[] elements = {1, 2, 3};
        //When
        QuickSort.quickSort(elements, 0, elements.length - 1);
        //Then
        assertArrayEquals(new int[]{1, 2, 3}, elements);

        //Given 1,3,2
        elements = new int[]{1, 3, 2};
        //When
        QuickSort.quickSort(elements, 0, elements.length - 1);
        //Then
        assertArrayEquals(new int[]{1, 2, 3}, elements);

        //Given 2,1,3
        elements = new int[]{2, 1, 3};
        //When
        QuickSort.quickSort(elements, 0, elements.length - 1);
        //Then
        assertArrayEquals(new int[]{1, 2, 3}, elements);

        //Given 2,3,1
        elements = new int[]{2, 3, 1};
        //When
        QuickSort.quickSort(elements, 0, elements.length - 1);
        //Then
        assertArrayEquals(new int[]{1, 2, 3}, elements);

        //Given 3,1,2
        elements = new int[]{3, 1, 2};
        //When
        QuickSort.quickSort(elements, 0, elements.length - 1);
        //Then
        assertArrayEquals(new int[]{1, 2, 3}, elements);

        //Given 3,2,1
        elements = new int[]{3, 2, 1};
        //When
        QuickSort.quickSort(elements, 0, elements.length - 1);
        //Then
        assertArrayEquals(new int[]{1, 2, 3}, elements);
    }
}
