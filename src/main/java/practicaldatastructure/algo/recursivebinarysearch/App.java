package practicaldatastructure.algo.recursivebinarysearch;

public class App {

    public static void main(String[] args) {
        int[] testArray = {2, 5, 10, 15, 20, 50, 150};

        System.out.println("-- binarySearch_Recursion --");
        System.out.println(recursiveBinarySearch(testArray, 0, testArray.length - 1, 2));
        System.out.println(recursiveBinarySearch(testArray, 0, testArray.length - 1, 5));
        System.out.println(recursiveBinarySearch(testArray, 0, testArray.length - 1, 10));
        System.out.println(recursiveBinarySearch(testArray, 0, testArray.length - 1, 15));
        System.out.println(recursiveBinarySearch(testArray, 0, testArray.length - 1, 20));
        System.out.println(recursiveBinarySearch(testArray, 0, testArray.length - 1, 50));
        System.out.println(recursiveBinarySearch(testArray, 0, testArray.length - 1, 150));

        System.out.println(recursiveBinarySearch(testArray, 0, testArray.length - 1, 1));
        System.out.println(recursiveBinarySearch(testArray, 0, testArray.length - 1, 7));
        System.out.println(recursiveBinarySearch(testArray, 0, testArray.length - 1, 120));
        System.out.println(recursiveBinarySearch(testArray, 0, testArray.length - 1, 200));
        System.out.println("----------------------------");
    }

    public static int recursiveBinarySearch(int[] a, int startPosition, int endPosition, int searchValue) {

        System.out.println("value: " + searchValue + " - search range: [" + startPosition + "..." + endPosition + "]");

        if (startPosition > endPosition || searchValue < a[startPosition] || searchValue > a[endPosition]) {
            return -1;
        }

        int searchIndex = (startPosition + endPosition) / 2;

        if (searchValue < a[searchIndex]) {
            return recursiveBinarySearch(a, startPosition, searchIndex - 1, searchValue);
        } else if (searchValue > a[searchIndex]) {
            return recursiveBinarySearch(a, searchIndex + 1, endPosition, searchValue);
        } else {
            return searchIndex;
        }
    }
}
