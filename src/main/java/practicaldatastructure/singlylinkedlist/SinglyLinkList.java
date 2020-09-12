package practicaldatastructure.singlylinkedlist;

public class SinglyLinkList {

    private Node first;

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Node node = new Node();
        node.data = data;
        node.next = first;
        first = node;
    }

    public Node deleteFirst() {
        if (isEmpty()) {
            return null;
        }

        Node deleteNode = first;
        first = deleteNode.next;

        return deleteNode;
    }

    public void insertLast(int data) {
        if (isEmpty()) {
            insertFirst(data);
            return;
        }

        Node node = first;
        while(node.next != null) {
            node = node.next;
        }

        Node lastNode = new Node();
        lastNode.data = data;

        node.next = lastNode;
    }

    public void displayData() {
        System.out.println("Print Singly Linked List -> first to last");
        System.out.println("=================");

        Node loopNode = first;
        int totalNodes = 0;
        while (loopNode != null) {
            totalNodes++;
            System.out.println("{ Data: " + loopNode.data + " }");
            loopNode = loopNode.next;
        }
        System.out.println("Total nodes: " + totalNodes);
    }
}
