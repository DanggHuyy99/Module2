package reverse;

import java.util.Stack;

public class Reverse {
    public static void reverse(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            stack.push(num);
        }
        int i = 0;
        while (!stack.isEmpty()){
            arr[i] = stack.pop();
            i++;
        }
    }
}
