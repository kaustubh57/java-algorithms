package practicaldatastructure.datastructure.heapdatastructure;

public class App {

    public static void main(String[] args) {
        Heap heapDS = new Heap(15);

        heapDS.insert(10);
        heapDS.insert(20);
        heapDS.insert(5);
        heapDS.insert(30);
        heapDS.insert(1);
        heapDS.insert(78);
        heapDS.insert(32);
        heapDS.insert(90);
        heapDS.insert(40);
        heapDS.insert(450);
        heapDS.insert(56);

        heapDS.printHeapDataStructure();

        System.out.println("======================");
        System.out.println("Removed node: " + heapDS.remove().getKey());
        System.out.println("======================");
        heapDS.printHeapDataStructure();

        System.out.println("======================");
        System.out.println("Removed node: " + heapDS.remove().getKey());
        System.out.println("======================");
        heapDS.printHeapDataStructure();

        System.out.println("======================");
        System.out.println("Removed node: " + heapDS.remove().getKey());
        System.out.println("======================");
        heapDS.printHeapDataStructure();

        heapDS.insert(450);
        heapDS.printHeapDataStructure();
    }
}
