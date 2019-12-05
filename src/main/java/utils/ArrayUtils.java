package utils;

public class ArrayUtils {

    private ArrayUtils() {
    }

    public static void swap(int[] elements, int positionA, int positionB) {
        int tempValue = elements[positionA];
        elements[positionA] = elements[positionB];
        elements[positionB] = tempValue;
    }
}
