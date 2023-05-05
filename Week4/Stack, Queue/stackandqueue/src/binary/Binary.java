package binary;

import java.util.Stack;

public class Binary {
    public static String checkBinary(int number) {
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            stack.push(number % 2);
            number = number / 2;
        }
        String num = "";
        while (!stack.isEmpty()){
            num += stack.pop();
        }
        return num;
    }
}
