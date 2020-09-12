package practicaldatastructure.circularlinkedlist;

public class CircularLinkedList {

    private Node first;
    private Node last;

    public void insertFirst(int data) {
        Node node = new Node();
        node.data = data;
        node.next = first;

        if (isEmpty()) {
            last = node;
        }

        first = node;
    }

    public void insertLast(int data) {
        Node node = new Node();
        node.data = data;

        if (isEmpty()) {
            first = node;
        } else {
            last.next = node;
        }

        last = node;
    }

    public Node deleteFirst() {
        System.out.println("-- DELETE FIRST --");
        if (isEmpty()) {
            return null;
        }

        Node toReturn = first;
        first = first.next;

        if (isEmpty()) {
            last = null;
        }

        return toReturn;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void displayData() {
        System.out.println("Circular linked list (first -> last)");
        System.out.println("=================");

        Node node = first;
        int totalNodes = 0;
        while (node != null) {
            System.out.println("{ data: " + node.data + "}");
            node = node.next;
            totalNodes++;
        }

        System.out.println("Total nodes: " + totalNodes);
    }
}
