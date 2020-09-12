package practicaldatastructure.doublylinkedlist;

public class App {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.displayData();

        doublyLinkedList.insertFirst(59);
        doublyLinkedList.insertFirst(100);
        doublyLinkedList.insertLast(23);

        doublyLinkedList.displayData();

        doublyLinkedList.deleteFirst();
        doublyLinkedList.insertLast(57);
        doublyLinkedList.insertFirst(11);

        doublyLinkedList.displayData();

        doublyLinkedList.deleteFirst();
        doublyLinkedList.displayData();

        doublyLinkedList.deleteLast();
        doublyLinkedList.deleteLast();
        doublyLinkedList.deleteLast();
        doublyLinkedList.deleteFirst();
        doublyLinkedList.deleteLast();
        doublyLinkedList.displayData();

        doublyLinkedList.insertLast(674);
        doublyLinkedList.insertFirst(932);
        doublyLinkedList.displayData();

        doublyLinkedList.insertAfter(100, 524);

        doublyLinkedList.displayData();

        doublyLinkedList.insertAfter(674, 524);

        doublyLinkedList.displayData();

        doublyLinkedList.insertAfter(932, 300);

        doublyLinkedList.displayData();

        doublyLinkedList.deleteKey(300);

        doublyLinkedList.displayData();

        doublyLinkedList.deleteKey(524);
        doublyLinkedList.insertFirst(499);

        doublyLinkedList.displayData();
    }
}
