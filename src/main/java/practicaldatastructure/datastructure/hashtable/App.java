package practicaldatastructure.datastructure.hashtable;

public class App {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(25);
        System.out.println(hashTable.arraySize);
        hashTable.insert("India");
        hashTable.insert("Canada");
        hashTable.insert("Australia");
        hashTable.insert("New Zealand");
        hashTable.insert("USA");
        hashTable.insert("Bhutan");
        hashTable.insert("Germany");
        hashTable.insert("South Africa");
        hashTable.insert("Singapore");

        System.out.println("size is: " + hashTable.size);

        System.out.println(hashTable.find("test"));
        System.out.println(hashTable.find("US"));
        System.out.println(hashTable.find("Bhutan"));

        System.out.println("==================");
        hashTable.displayHashTableData();
    }

}
