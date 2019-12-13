package recursion;

public class RecursionExperiments {

    public int additionOfArray(int[] integerArray, int baseIndex, int lastIndex) {
        if (baseIndex > lastIndex) {
            return 0;
        }

        if (baseIndex == lastIndex) {
            return integerArray[baseIndex];
        }

        return integerArray[baseIndex] + additionOfArray(integerArray, baseIndex + 1, lastIndex);
    }

    public int countNumberOfItemsFromArray(int[] integerArray, int baseIndex, int lastIndex) {
        if (baseIndex > lastIndex) {
            return 0;
        }

        if (baseIndex == lastIndex) {
            return 1;
        }

        return 1 + countNumberOfItemsFromArray(integerArray, baseIndex + 1, lastIndex);
    }

    public int findMaxFromArray(int[] integerArray, int baseIndex, int lastIndex) {
        if (baseIndex > lastIndex) {
            return 0;
        }

        if (baseIndex == lastIndex) {
            return integerArray[baseIndex];
        }

        int baseValue = integerArray[baseIndex];
        int maxValue = findMaxFromArray(integerArray, baseIndex + 1, lastIndex);

        return Math.max(baseValue, maxValue);
    }
}
