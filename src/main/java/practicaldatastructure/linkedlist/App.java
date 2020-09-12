package practicaldatastructure.linkedlist;

public class App {

    public static void main(String[] argv) {
        Node nodeA = new Node();
        nodeA.data = 3;

        Node nodeB = new Node();
        nodeB.data = 4;

        Node nodeC = new Node();
        nodeC.data = 7;

        Node nodeD = new Node();
        nodeD.data = 8;

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println("link list A size: " + linkedListLength(nodeA));
        System.out.println("link list B size: " + linkedListLength(nodeB));
    }

    public static int linkedListLength(Node node) {
        int lengthCounter = 1;
        while(node.next != null) {
            lengthCounter++;
            node = node.next;
        }
        return lengthCounter;
    }
}
