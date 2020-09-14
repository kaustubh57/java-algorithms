package practicaldatastructure.datastructure.stack;

public class App {

    public static void main(String[] args) {
        Stack stack = new Stack(Integer[].class, 3);
        stack.push(6);
        stack.push(5);
        stack.push(8);
        stack.push(10);

        while(!stack.isEmpty()) {
            Integer value = (Integer) stack.pop();
            System.out.println(value);
        }

        System.out.println(reverseString("Kaustubh"));
        System.out.println(reverseString("KaNak"));
        System.out.println(reverseString("JavaProgramming"));
    }

    public static String reverseString(String str) {
        int stackSize = str.length();
        Stack strReverseStack = new Stack(Character[].class, stackSize);
        for (int i=0; i<stackSize; i++) {
            strReverseStack.push(str.charAt(i));
        }

        StringBuilder toReturn = new StringBuilder();
        while(!strReverseStack.isEmpty()) {
            toReturn.append(strReverseStack.pop());
        }

        return toReturn.toString();
    }
}
