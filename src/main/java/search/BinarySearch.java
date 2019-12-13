package search;

class BinarySearch {

    int binarySearch_integer(int[] list, int searchNumber) {
        if (list.length > 0) {
            int lowNumberIndex = 0;
            int highNumberIndex = list.length - 1;

            while (lowNumberIndex <= highNumberIndex) {
                int midNumberIndex = (lowNumberIndex + highNumberIndex) / 2;
                int guessNumber = list[midNumberIndex];
                if (guessNumber == searchNumber) {
                    return guessNumber;
                }
                if (guessNumber < searchNumber) {
                    lowNumberIndex = midNumberIndex + 1;
                } else {
                    highNumberIndex = midNumberIndex - 1;
                }
            }
        }
        return -1;
    }

    int binarySearch_integer_withRecursion(int[] list, int baseIndex, int lastIndex, int searchNumber) {
        if (list.length > 0 && baseIndex <= lastIndex) {
            int midNumberIndex = (baseIndex + lastIndex) / 2;
            int guessNumber = list[midNumberIndex];
            if (guessNumber == searchNumber) {
                return guessNumber;
            }
            if (guessNumber < searchNumber) {
                baseIndex = midNumberIndex + 1;
            } else {
                lastIndex = midNumberIndex - 1;
            }

            return binarySearch_integer_withRecursion(list, baseIndex, lastIndex, searchNumber);
        }
        return -1;
    }
}
