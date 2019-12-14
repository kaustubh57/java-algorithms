package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuickSort2 {

    public static int[] quickSort(int[] listToSort) {
        if (listToSort != null) {
            if (listToSort.length < 2) {
                return listToSort;
            }

            int pivot = listToSort[0];
            List<Integer> pivotList = new ArrayList<>();
            List<Integer> lhList = new ArrayList<>();
            List<Integer> rhList = new ArrayList<>();

            for (int value : listToSort) {
                if (value < pivot) {
                    lhList.add(value);
                } else if (value > pivot) {
                    rhList.add(value);
                } else {
                    pivotList.add(value);
                }
            }

            int[] lhArray = quickSort(lhList.stream().mapToInt(i -> i).toArray());
            int[] rhArray = quickSort(rhList.stream().mapToInt(i -> i).toArray());

            List<Integer> finalList = new ArrayList<>();
            finalList.addAll(Arrays.stream(lhArray).boxed().collect(Collectors.toList()));
            finalList.addAll(pivotList);
            finalList.addAll(Arrays.stream(rhArray).boxed().collect(Collectors.toList()));

            return finalList.stream().mapToInt(i -> i).toArray();
        } else {
            return new int[]{};
        }
    }
}
