package myexperiments.linkedlist;

public class LinkedList {

    Node head;
    Node tail;
    int size;

    public LinkedList(int value) {
        head = new Node(value);
        tail = head;
        size = 1;
    }

    public Node insert(int value) {
        Node newNode = new Node(value);
        this.tail.next = newNode;
        this.tail = newNode;
        size++;
        return newNode;
    }

    public Node insert(int index, int value) {
        if (index < 0) {
            return null;
        }

        if (index == 0) {
            return addHead(value);
        } else if (index >= size) {
            return insert(value);
        }

        Node leaderNode = getNode(index - 1);
        Node newNode = new Node(value);
        newNode.next = leaderNode.next;
        leaderNode.next = newNode;
        size++;

        return newNode;
    }

    public Node addHead(int value) {
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
        return newNode;
    }

    public boolean remove(int index) {
        if (index >= size - 1) {
            return removeTail();
        }

        Node leader = getNode(index - 1);
        Node nodeToRemove = leader.next;
        leader.next = leader.next.next;
        size--;
        nodeToRemove = null;
        return true;
    }

    public boolean removeTail() {
        if (size <= 1) {
            head = null;
            tail = null;
            return true;
        }

        Node newTail = getNode(size - 2);
        Node nodeToRemove = newTail.next;
        newTail.next = null;
        tail = newTail;
        size--;
        nodeToRemove = null;
        return true;
    }

    public void reverse() {
        if (head == null) {
            return;
        }

        Node newTailNode = head;

        Node newLeaderNode = head;
        Node nextLeaderNode = newLeaderNode.next;
        Node newFollowerNode;

        while(nextLeaderNode != null) {
            newFollowerNode = newLeaderNode;
            newLeaderNode = nextLeaderNode;

            nextLeaderNode = newLeaderNode.next;

            newLeaderNode.next = newFollowerNode;
        }

        head = newLeaderNode;
        tail = newTailNode;
        tail.next = null;
    }

    public Node getNode(int index) {
        if (index >= size) {
            return tail;
        }

        Node currentNode = head;
        int nodeCounter = 0;
        while (nodeCounter < index) {
            currentNode = currentNode.next;
            nodeCounter++;
        }

        return currentNode;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
