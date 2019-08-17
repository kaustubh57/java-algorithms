package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void testSizeAndIsEmpty() {
        //Given
        Stack<Integer> stack = new Stack<>();

        //When
        int size = stack.getSize();
        boolean isEmpty = stack.isEmpty();

        //Then
        assertEquals(size, 0);
        assertTrue(isEmpty);
        assertNull(stack.getTop());
    }

    @Test
    void testWithSingleElement() throws Stack.StackOverflowException {
        //Given
        Stack<Integer> stack = new Stack<>();
        stack.push(100);

        //When
        int size = stack.getSize();
        boolean isEmpty = stack.isEmpty();

        //Then
        assertEquals(size, 1);
        assertFalse(isEmpty);
        assertEquals(stack.getTop().getData(), 100);
        assertNotNull(stack.getTop());
        assertNull(stack.getTop().getNext());
        assertFalse(stack.isFull());
    }

    @Test
    void testPushThrowsStackOverflowException() throws Stack.StackOverflowException {
        //Given
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);

        //Then
        assertThrows(Stack.StackOverflowException.class, () -> {
            //When
            stack.push(600);
        });
    }

    @Test
    void testTopElement() throws Stack.StackOverflowException {
        //Given
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);

        //When
        stack.push(300);

        //Then
        assertEquals(stack.getTop().getData(), 300);
    }

    @Test
    void testUpdateTopElement() throws Stack.StackOverflowException {
        //Given
        Stack<Integer> stack = new Stack<>();
        stack.push(100);

        //When
        stack.getTop().setData(200);

        //Then
        assertEquals(stack.getTop().getData(), 200);
    }

    @Test
    void testUpdateNextElement() throws Stack.StackOverflowException {
        //Given
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);

        //When
        stack.getTop().getNext().setData(300);

        //Then
        assertEquals(stack.getTop().getNext().getData(), 300);
    }

    @Test
    void testPeekElement() throws Stack.StackUnderFlowException, Stack.StackOverflowException {
        //Given
        Stack<Integer> stack = new Stack<>();
        stack.push(100);

        //When
        int topData = stack.peek();
        int size = stack.getSize();
        boolean isEmpty = stack.isEmpty();

        //Then
        assertEquals(topData, 100);
        assertEquals(size, 1);
        assertFalse(isEmpty);
    }

    @Test
    void testPeekElementShouldThrowStackUnderFlowException() {
        //Given
        Stack<Integer> stack = new Stack<>();

        //Then
        assertThrows(Stack.StackUnderFlowException.class, () -> {
            //When
            stack.peek();
        });
    }

    @Test
    void testPopElement() throws Stack.StackUnderFlowException, Stack.StackOverflowException {
        //Given
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);

        //When
        Integer popData = stack.pop();
        int size = stack.getSize();
        boolean isEmpty = stack.isEmpty();

        //Then
        assertEquals(popData, 200);
        assertEquals(size, 1);
        assertFalse(isEmpty);
        assertEquals(stack.peek(), 100);
    }

    @Test
    void testPopElementThrowStackUnderFlowException() {
        //Given
        Stack<Integer> stack = new Stack<>();

        //Then
        assertThrows(Stack.StackUnderFlowException.class, () -> {
            //When
            stack.pop();
        });
    }

}
