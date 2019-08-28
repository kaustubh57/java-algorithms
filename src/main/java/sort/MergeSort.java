package sort;

public class MergeSort {

    public static int additionOfElementsWithRecursion(int[] elements, int beginIndex, int endIndex) {
        if (beginIndex == endIndex) {
            return elements[endIndex];
        }

        return elements[beginIndex] + additionOfElementsWithRecursion(elements, beginIndex + 1, endIndex);
    }

    public static void mergeSort(int[] listToSort) {
        System.out.println("----------- listToSort -----------");
        for (int element : listToSort) {
            System.out.print(" | " + element);
        }
        System.out.println(" |");

        if (listToSort.length == 1) {
            return;
        }

        int middleIndex = listToSort.length / 2 + listToSort.length % 2;
        int[] lhList = new int[middleIndex];
        int[] rhList = new int[listToSort.length - middleIndex];

        split(listToSort, lhList, rhList);

        mergeSort(lhList);
        mergeSort(rhList);

        merge(listToSort, lhList, rhList);
    }

    public static void split(int[] listToSort, int[] lhList, int[] rhList) {
        for (int i = 0; i < listToSort.length; i++) {
            if (i < lhList.length) {
                lhList[i] = listToSort[i];
            } else {
                rhList[i - lhList.length] = listToSort[i];
            }
        }
    }

    public static void merge(int[] listToSort, int[] lhList, int[] rhList) {
        System.out.println("----------- merge -----------");
        System.out.println("------- ## LH List ## -------");
        for (int element : lhList) {
            System.out.print(" | " + element);
        }
        System.out.println(" |");
        System.out.println("------- ## RH List ## -------");
        for (int element : rhList) {
            System.out.print(" | " + element);
        }
        System.out.println(" |");

        if (listToSort.length == 1) {
            return;
        }

        int lhPosition = 0, rhPosition = 0, sortedIndex = 0;

        for (int i = 0; i < lhList.length; i++) {
            if (rhPosition != rhList.length) {
                for (int j = rhPosition; j < rhList.length; j++) {
                    if (rhList[j] < lhList[i]) {
                        listToSort[sortedIndex] = rhList[j];
                        rhPosition = j + 1;
                        sortedIndex++;
                    } else {
                        listToSort[sortedIndex] = lhList[i];
                        lhPosition = i + 1;
                        sortedIndex++;
                        break;
                    }
                }
            } else {
                listToSort[sortedIndex] = lhList[i];
                lhPosition = i + 1;
                sortedIndex++;
            }
        }

        if (lhPosition != lhList.length) {
            for (int i = lhPosition; i < lhList.length; i++) {
                listToSort[sortedIndex] = lhList[i];
                sortedIndex++;
            }
        }

        if (rhPosition != rhList.length) {
            for (int i = rhPosition; i < rhList.length; i++) {
                listToSort[sortedIndex] = rhList[i];
                sortedIndex++;
            }
        }

        System.out.println("---- [after merge] listToSort -------");
        for (int element : listToSort) {
            System.out.print(" | " + element);
        }
        System.out.println(" |");

    }

}
