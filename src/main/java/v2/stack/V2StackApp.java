package v2.stack;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class V2StackApp {

    public static void main(String[] args) {
        log.info("Reverse string: {}", reverseString("kaustubh"));
        longStackExperiment();
    }

    public static String reverseString(String inputString) {
        V2Stack<Character> charV2Stack = new V2Stack<>(inputString.length());
        for(char stringChar: inputString.toCharArray()) {
            charV2Stack.push(stringChar);
        }

        StringBuilder outputString = new StringBuilder("");
        while(!charV2Stack.isEmpty()) {
            outputString.append(charV2Stack.pop());
        }

        return outputString.toString();
    }

    public static void longStackExperiment() {
        V2Stack<Long> theV2Stack = new V2Stack<>(3);
        theV2Stack.push(20L);
        theV2Stack.push(40L);
        theV2Stack.push(60L);
        theV2Stack.push(80L);

        while(!theV2Stack.isEmpty()) {
            long value = theV2Stack.pop();
            System.out.println(value);
        }

//        System.out.println(theStack.pop());
    }
}
