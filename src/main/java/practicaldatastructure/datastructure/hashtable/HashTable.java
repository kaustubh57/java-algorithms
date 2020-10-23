package practicaldatastructure.datastructure.hashtable;

public class HashTable {

    String[] hashArray;
    int arraySize;
    int size = 0;

    public HashTable(int slots) {
        if (slots < 2 || !isPrime(slots)) {
            arraySize = getNextPrime(slots);
        } else {
            arraySize = slots;
        }

        hashArray = new String[arraySize];
    }

    public void insert(String word) {
        if (size == arraySize) {
            System.out.println("HashTable is full!");
            return;
        }

        int hashValue = hashFunction1(word);
        int stepValue = hashFunction2(word);

        while (hashArray[hashValue] != null) {
            hashValue = hashValue + stepValue;
            hashValue = hashValue % arraySize;
        }

        hashArray[hashValue] = word;
        System.out.println("Inserted Word at: " + hashValue + " and value " + word);
        size++;
    }

    public String find(String word) {
        int hashValue = hashFunction1(word);
        int stepValue = hashFunction2(word);

        while (hashArray[hashValue] != null) {
            if (hashArray[hashValue].equals(word)) {
                System.out.println("Found " + word + " at " + hashValue);
                return hashArray[hashValue];
            }
            hashValue = hashValue + stepValue;
            hashValue = hashValue % arraySize;
        }

        System.out.println("'" + word + "' not found!");
        return hashArray[hashValue];
    }

    public void displayHashTableData() {
        System.out.println("Hash Table:");
        for(int i = 0; i < arraySize; i++) {
            if (hashArray[i] != null) {
                System.out.println(hashArray[i] + " :: " + i);
            } else {
                System.out.println("[xxxx] :: " + i);
            }
        }
        System.out.println("=========================");
    }

    private boolean isPrime(int number) {
        for (int numberToCheck = 2; numberToCheck < number / 2; numberToCheck++) {
            if (number % numberToCheck == 0) {
                return false;
            }
        }

        return true;
    }

    private int getNextPrime(int size) {
        while (!isPrime(size)) size++;
        return size;
    }

    // preferred index position
    private int hashFunction1(String word) {
        int hashValue = word.hashCode();
        hashValue = hashValue % arraySize;

        if (hashValue < 0) {
            hashValue = hashValue + arraySize;
        }

        return hashValue;
    }

    // step size
    private int hashFunction2(String word) {
        int hashValue = word.hashCode();
        hashValue = hashValue % arraySize;

        if (hashValue < 0) {
            hashValue = hashValue + arraySize;
        }

        return 3 - hashValue % 3;
    }
}
