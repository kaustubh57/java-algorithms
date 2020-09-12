package practicaldatastructure.doublylinkedlist;

public class DoublyLinkedList {

    Node first;
    Node last;

    public void insertFirst(int data) {
        Node node = new Node();
        node.data = data;

        if (isEmpty()) {
            last = node;
        } else {
            node.next = first;
            first.previous = node;
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
            node.previous = last;
        }

        last = node;
    }

    public Node deleteFirst() {
        if (isEmpty()) {
            return null;
        }

        Node toReturn = first;
        first = first.next;

        if (isEmpty()) {
            last = null;
        } else {
            first.previous = null;
        }

        return toReturn;
    }

    public Node deleteLast() {
        if (isEmpty()) {
            return null;
        }

        Node toReturn = last;
        last = last.previous;

        if (last == null) {
            first = null;
        } else {
            last.next = null;
        }

        return toReturn;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public boolean insertAfter(int key, int data) {
        Node node = first;
        while (node != null) {
            if (node.data == key) {
                Node nodeToInsert = new Node();
                nodeToInsert.data = data;
                nodeToInsert.next = node.next;
                nodeToInsert.previous = node;

                if (nodeToInsert.next != null) {
                    nodeToInsert.next.previous = nodeToInsert;
                } else {
                    last = nodeToInsert;
                }

                node.next = nodeToInsert;

                return true;
            }
            node = node.next;
        }

        System.out.println("-- No node found to insert after key: " + key);
        return false;
    }

    public Node deleteKey(int key) {
        Node node = first;
        while(node != null) {
            if (node.data == key) {
                if (node.previous == null) {
                    return deleteFirst();
                } else if (node.next == null) {
                    return  deleteLast();
                }

                node.previous.next = node.next;
                node.next.previous = node.previous;

                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void displayData() {
        System.out.println("=================");
        System.out.println("Doubly Linked List data (Last -> First)");
        System.out.println("=================");

        Node node = last;
        int totalNodes = 0;
        while (node != null) {
            System.out.println("{ data: " + node.data + " }");
            node = node.previous;
            totalNodes++;
        }

        System.out.println("Total nodes: " + totalNodes);
        System.out.println(" ---------------------- ");
    }


}
