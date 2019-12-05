package search;

class BinarySearch {

    int binarySearch_integer(int[] list, int searchNumber) {
        if (list.length > 0) {
            boolean found = false;
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
}
