package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StackMatchingParenthesesTest {

    @Test
    void testRoundBrackets() {
        //Given
        StackMatchingParentheses stackMatchingParentheses = new StackMatchingParentheses();
        final String testInput = "()";

        //When
        boolean isValid = stackMatchingParentheses.isValid(testInput);

        //Then
        assertTrue(isValid);
    }

    @Test
    void testBoxBrackets() {
        //Given
        StackMatchingParentheses stackMatchingParentheses = new StackMatchingParentheses();
        final String testInput = "[]";

        //When
        boolean isValid = stackMatchingParentheses.isValid(testInput);

        //Then
        assertTrue(isValid);
    }

    @Test
    void testCurlyBrackets() {
        //Given
        StackMatchingParentheses stackMatchingParentheses = new StackMatchingParentheses();
        final String testInput = "{}";

        //When
        boolean isValid = stackMatchingParentheses.isValid(testInput);

        //Then
        assertTrue(isValid);
    }

    @Test
    void testAngleBrackets() {
        //Given
        StackMatchingParentheses stackMatchingParentheses = new StackMatchingParentheses();
        final String testInput = "<>";

        //When
        boolean isValid = stackMatchingParentheses.isValid(testInput);

        //Then
        assertTrue(isValid);
    }

    @Test
    void testRoundBoxCurlyAngleBracketsAndCharacters() {
        //Given
        StackMatchingParentheses stackMatchingParentheses = new StackMatchingParentheses();
        final String testInput = "{()abcd<()>(xyc)({<>})}";

        //When
        boolean isValid = stackMatchingParentheses.isValid(testInput);

        //Then
        assertTrue(isValid);
    }

    @Test
    void testMissingOpeningBracket() {
        //Given
        StackMatchingParentheses stackMatchingParentheses = new StackMatchingParentheses();
        final String testInput = "abcd{}";

        //Then
        assertThrows(StackMatchingParentheses.MissingOpeningBracket.class, () -> {
            //When
            stackMatchingParentheses.isValid(testInput);
        });
    }

    @Test
    void testMissingOpeningBracket_EmptyInput() {
        //Given
        StackMatchingParentheses stackMatchingParentheses = new StackMatchingParentheses();
        final String testInput = "";

        //Then
        assertThrows(StackMatchingParentheses.MissingOpeningBracket.class, () -> {
            //When
            stackMatchingParentheses.isValid(testInput);
        });
    }

    @Test
    void testMissingOpeningBracket_NullInput() {
        //Given
        StackMatchingParentheses stackMatchingParentheses = new StackMatchingParentheses();
        final String testInput = null;

        //Then
        assertThrows(StackMatchingParentheses.MissingOpeningBracket.class, () -> {
            //When
            stackMatchingParentheses.isValid(testInput);
        });
    }

}
