package stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StackMatchingParentheses {

    private static Map<Character, Character> parenthesesMap = new HashMap<>();

    static {
        parenthesesMap.put('(', ')');
        parenthesesMap.put('{', '}');
        parenthesesMap.put('[', ']');
        parenthesesMap.put('<', '>');
    }

    public boolean isValid(String value) {
        if (value == null || value.length() == 0 || parenthesesMap.get(value.charAt(0)) == null) {
            throw new MissingOpeningBracket();
        }

        Stack<Character> parenthesesStack = new Stack<>();
        List<Character> inputCharacterList = new ArrayList<>();
        for (int i = 0; i < value.length(); i++) {
            Character inputCharacter = value.charAt(i);

            if (parenthesesMap.get(inputCharacter) == null) {
                if (parenthesesStack.getSize() > 0 && parenthesesStack.peek() == inputCharacter) {
                    parenthesesStack.pop();
                } else {
                    inputCharacterList.add(inputCharacter);
                }
            } else {
                parenthesesStack.push(parenthesesMap.get(inputCharacter));
            }
        }

        return inputCharacterList.size() != value.length() && parenthesesStack.isEmpty();
    }

    public static class MissingOpeningBracket extends RuntimeException {
    }
}
