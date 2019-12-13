package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursionExperimentsTest {

    @Test
    void additionOfArray() {
        //Given
        RecursionExperiments recursionExperiments = new RecursionExperiments();

        //When
        int[] sampleList = {1, 2, 3, 4, 5};
        int total = recursionExperiments.additionOfArray(sampleList, 0, sampleList.length - 1);

        //Then
        assertEquals(15, total);
    }

    @Test
    void additionOfArray_SingleItem() {
        //Given
        RecursionExperiments recursionExperiments = new RecursionExperiments();

        //When
        int[] sampleList = {7};
        int total = recursionExperiments.additionOfArray(sampleList, 0, sampleList.length - 1);

        //Then
        assertEquals(7, total);
    }

    @Test
    void additionOfArray_NoItem() {
        //Given
        RecursionExperiments recursionExperiments = new RecursionExperiments();

        //When
        int[] sampleList = {};
        int total = recursionExperiments.additionOfArray(sampleList, 0, sampleList.length - 1);

        //Then
        assertEquals(0, total);
    }

    @Test
    void countNumberOfItemsFromArray() {
        //Given
        RecursionExperiments recursionExperiments = new RecursionExperiments();

        //When
        int[] sampleList = {1, 2, 3, 4, 5};
        int arrayCount = recursionExperiments.countNumberOfItemsFromArray(sampleList, 0, sampleList.length - 1);

        //Then
        assertEquals(5, arrayCount);
    }

    @Test
    void countNumberOfItemsFromArray_SingleItem() {
        //Given
        RecursionExperiments recursionExperiments = new RecursionExperiments();

        //When
        int[] sampleList = {17};
        int arrayCount = recursionExperiments.countNumberOfItemsFromArray(sampleList, 0, sampleList.length - 1);

        //Then
        assertEquals(1, arrayCount);
    }

    @Test
    void countNumberOfItemsFromArray_NoItem() {
        //Given
        RecursionExperiments recursionExperiments = new RecursionExperiments();

        //When
        int[] sampleList = {};
        int arrayCount = recursionExperiments.countNumberOfItemsFromArray(sampleList, 0, sampleList.length - 1);

        //Then
        assertEquals(0, arrayCount);
    }

    @Test
    void findMaxFromArray() {
        //Given
        RecursionExperiments recursionExperiments = new RecursionExperiments();

        //When
        int[] sampleList = {31, 22, 76, 9, 55};
        int maxNumber = recursionExperiments.findMaxFromArray(sampleList, 0, sampleList.length - 1);

        //Then
        assertEquals(76, maxNumber);
    }

    @Test
    void findMaxFromArray_SingleItem() {
        //Given
        RecursionExperiments recursionExperiments = new RecursionExperiments();

        //When
        int[] sampleList = {17};
        int maxNumber = recursionExperiments.findMaxFromArray(sampleList, 0, sampleList.length - 1);

        //Then
        assertEquals(17, maxNumber);
    }

    @Test
    void findMaxFromArray_NoItem() {
        //Given
        RecursionExperiments recursionExperiments = new RecursionExperiments();

        //When
        int[] sampleList = {};
        int maxNumber = recursionExperiments.findMaxFromArray(sampleList, 0, sampleList.length - 1);

        //Then
        assertEquals(0, maxNumber);
    }
}
