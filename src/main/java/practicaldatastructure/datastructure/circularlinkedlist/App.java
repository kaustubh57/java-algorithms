package practicaldatastructure.datastructure.circularlinkedlist;

public class App {

    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.deleteFirst();
        circularLinkedList.displayData();

        circularLinkedList.insertFirst(10);
        circularLinkedList.deleteFirst();
        circularLinkedList.displayData();

        circularLinkedList.insertLast(48);
        circularLinkedList.displayData();

        circularLinkedList.insertFirst(7);
        circularLinkedList.insertFirst(2);
        circularLinkedList.insertLast(105);

        circularLinkedList.displayData();

        circularLinkedList.deleteFirst();
        circularLinkedList.insertLast(333);

        circularLinkedList.displayData();
    }
}
