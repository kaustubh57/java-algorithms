package practicaldatastructure.algo.binarysearch;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        int[] testArray = {2, 5, 10, 15, 20, 50, 150};

        System.out.println("-- binarySearch_Recursion --");
        System.out.println(binarySearch_Recursion_isExist(2, testArray));
        System.out.println(binarySearch_Recursion_isExist(5, testArray));
        System.out.println(binarySearch_Recursion_isExist(10, testArray));
        System.out.println(binarySearch_Recursion_isExist(15, testArray));
        System.out.println(binarySearch_Recursion_isExist(20, testArray));
        System.out.println(binarySearch_Recursion_isExist(50, testArray));
        System.out.println(binarySearch_Recursion_isExist(150, testArray));

        System.out.println(binarySearch_Recursion_isExist(1, testArray));
        System.out.println(binarySearch_Recursion_isExist(7, testArray));
        System.out.println(binarySearch_Recursion_isExist(120, testArray));
        System.out.println(binarySearch_Recursion_isExist(200, testArray));
        System.out.println("----------------------------");
        System.out.println("-- binarySearch_WhileLoop --");
        System.out.println(binarySearch_WhileLoop_index(2, testArray));
        System.out.println(binarySearch_WhileLoop_index(5, testArray));
        System.out.println(binarySearch_WhileLoop_index(10, testArray));
        System.out.println(binarySearch_WhileLoop_index(15, testArray));
        System.out.println(binarySearch_WhileLoop_index(20, testArray));
        System.out.println(binarySearch_WhileLoop_index(50, testArray));
        System.out.println(binarySearch_WhileLoop_index(150, testArray));

        System.out.println(binarySearch_WhileLoop_index(1, testArray));
        System.out.println(binarySearch_WhileLoop_index(7, testArray));
        System.out.println(binarySearch_WhileLoop_index(120, testArray));
        System.out.println(binarySearch_WhileLoop_index(200, testArray));
    }

    public static boolean binarySearch_Recursion_isExist(int x, int[] a) {
        if (a.length == 1) {
            if (x == a[0]) {
//                return a[0];
                return true;
            } else {
//                return -1;
                return false;
            }
        }

        if (x < a[0] || x > a[a.length - 1]) {
//            return -1;
            return false;
        }

        int searchIndex = a.length / 2;
        int searchValue = a[searchIndex];

        if (searchValue == x) {
//            return searchValue;
            return true;
        }

        if (searchValue > x) {
            return binarySearch_Recursion_isExist(x, Arrays.copyOfRange(a, 0, searchIndex));
        } else {
            return binarySearch_Recursion_isExist(x, Arrays.copyOfRange(a, searchIndex + 1, a.length));
        }
    }

    public static int binarySearch_WhileLoop_index(int x, int[] a) {
        int p = 0;
        int r = a.length - 1;

        while(p <= r) {
            int q = (p+r)/2;
            int searchValue = a[q];

            if(searchValue > x) {
                r = q-1;
            } else if (searchValue < x) {
                p = q+1;
            } else {
                return q;
            }
        }

        return -1;
    }
}
