package practicaldatastructure.algorithm.recursivelinearsearch;

public class App {

    public static void main(String[] args) {

        int[] testArray = {4, 1, 2, 3, 60, 32, 458};

        System.out.println(recursiveLinearSearch(testArray, 0, 60));
        System.out.println(recursiveLinearSearch(testArray, 0, 32));
        System.out.println(recursiveLinearSearch(testArray, 0, 4));

        System.out.println(recursiveLinearSearch(testArray, 0, 22));
        System.out.println(recursiveLinearSearch(testArray, 0, 568));

    }

    public static int recursiveLinearSearch(int[] a, int index, int value) {
        if(index > a.length-1) {
            return -1;
        }

        if (a[index] == value) {
            return index;
        }

        index++;
        return recursiveLinearSearch(a, index, value);
    }
}
