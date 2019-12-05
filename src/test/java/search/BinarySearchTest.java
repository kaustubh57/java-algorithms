package search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void binarySearch_integer() {
        //Given
        BinarySearch binarySearch = new BinarySearch();
        int[] searchList = {1, 3, 5, 7, 9};
        int searchNumber1 = 3;
        int searchNumber2 = 9;
        int searchNotInList = 6;

        //When
        final int result1 = binarySearch.binarySearch_integer(searchList, searchNumber1);
        final int result2 = binarySearch.binarySearch_integer(searchList, searchNumber2);
        final int resultNotInList = binarySearch.binarySearch_integer(searchList, searchNotInList);
        final int resultForEmptyList = binarySearch.binarySearch_integer(new int[]{}, 100);
        final int resultNotInListForSingleValueList = binarySearch.binarySearch_integer(new int[]{4}, 100);
        final int resultInListForSingleValueList = binarySearch.binarySearch_integer(new int[]{100}, 100);

        //Then
        assertEquals(searchNumber1, result1);
        assertEquals(searchNumber2, result2);
        assertEquals(-1, resultNotInList);
        assertEquals(-1, resultForEmptyList);
        assertEquals(-1, resultNotInListForSingleValueList);
        assertEquals(100, resultInListForSingleValueList);
    }
}
