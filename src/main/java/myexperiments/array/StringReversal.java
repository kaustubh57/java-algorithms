package myexperiments.array;

import java.util.Arrays;

public class StringReversal {

    public static void main(String[] args) {
        String s = "Hi abc";
        char[] stringCharArray = s.toCharArray();

        System.out.println(stringCharArray);

        for (int i = 0, j = stringCharArray.length - 1; i < stringCharArray.length / 2; i++, j--) {
            char temp = stringCharArray[i];
            stringCharArray[i] = stringCharArray[j];
            stringCharArray[j] = temp;
        }

        System.out.println(String.valueOf(stringCharArray));
    }
}
