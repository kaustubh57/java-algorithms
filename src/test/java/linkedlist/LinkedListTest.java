package linkedlist;

import org.junit.jupiter.api.Test;

public class LinkedListTest {

    private final LinkedList linkedList = new LinkedList<>();

    @Test
    void testNext() {
        //assertEquals(2, 2);

        linkedList.head = new LinkedList.Node(1);
        LinkedList.Node second = new LinkedList.Node(2);
        LinkedList.Node third = new LinkedList.Node(3);


        linkedList.head.next = second;
        second.next = third;
    }
}
