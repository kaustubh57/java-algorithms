package practicaldatastructure.algo.linearsearch;

public class App {

    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 99));
    }

    public static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (x == a[i]) {
                return i;
            }
        }

        return -1;
    }
}
