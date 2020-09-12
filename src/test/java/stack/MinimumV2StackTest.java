package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MinimumV2StackTest {

    private MinimumStack minimumStack;

    @BeforeEach
    void setUp() {
        minimumStack = new MinimumStack();
    }

    @Test
    void push() {
        // When
        minimumStack.push(400);
        minimumStack.push(200);
        minimumStack.push(700);
        minimumStack.push(900);

        // Then
        assertEquals(minimumStack.getMinimumValue(), 200);
        assertEquals(minimumStack.getSize(), 4);
    }

    @Test
    void pop() {
        // When
        minimumStack.push(400);
        minimumStack.push(200);
        minimumStack.push(700);
        minimumStack.push(900);
        minimumStack.push(100);

        // Then
        assertEquals(minimumStack.getMinimumValue(), 100);
        assertEquals(minimumStack.getSize(), 5);

        // When
        minimumStack.pop();

        // Then
        assertEquals(minimumStack.getMinimumValue(), 200);
        assertEquals(minimumStack.getSize(), 4);
    }

    @Test
    void pop_StackUnderFlowException() {
        //Then
        assertThrows(Stack.StackUnderFlowException.class, () -> {
            //When
            minimumStack.pop();
        });
    }

    @Test
    void peek() {
        // When
        minimumStack.push(400);
        minimumStack.push(200);
        minimumStack.push(700);
        minimumStack.push(900);

        // Then
        assertEquals(minimumStack.peek(), 900);
        assertEquals(minimumStack.getSize(), 4);
    }

    @Test
    void peek_StackUnderFlowException() {
        //Then
        assertThrows(Stack.StackUnderFlowException.class, () -> {
            //When
            minimumStack.peek();
        });
    }

    @Test
    void getMinimumValue() {
        // When
        minimumStack.push(400);
        minimumStack.push(200);
        minimumStack.push(700);
        minimumStack.push(100);

        // Then
        assertEquals(minimumStack.getMinimumValue(), 100);
        assertEquals(minimumStack.getSize(), 4);
    }

    @Test
    void getMinimumValue_StackUnderFlowException() {
        //Then
        assertThrows(Stack.StackUnderFlowException.class, () -> {
            //When
            minimumStack.getMinimumValue();
        });
    }
}
