package myexperiments.hashtable;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRecurringElement {

    public static void main(String[] args) {

        int[] testArray1 = {2, 5, 1, 2, 3, 5, 1, 2, 4};
        int[] testArray2 = {2, 1, 1, 2, 3, 5, 1, 2, 4};
        int[] testArray3 = {2, 3, 4, 5};

        System.out.println("1. First recurring element is: " + findFirstRecurringElement(testArray1));
        System.out.println("2. First recurring element is: " + findFirstRecurringElement(testArray2));
        System.out.println("3. First recurring element is: " + findFirstRecurringElement(testArray3));
        System.out.println("4. First recurring element is: " + findFirstRecurringElement(new int[]{1, 1}));
        System.out.println("5. First recurring element is: " + findFirstRecurringElement(null));
    }

    private static int findFirstRecurringElement(int[] array) {
        if (array == null) {
            return -1;
        };

        Set<Integer> set = new HashSet<>();
        for (int i : array) {
            if (set.contains(i)) {
                return i;
            }
            set.add(i);
        }
        return -1;
    }
}
