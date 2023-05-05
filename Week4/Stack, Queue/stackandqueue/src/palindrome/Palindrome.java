package palindrome;

import java.util.LinkedList;
import java.util.Queue;

public class Palindrome {
    public static boolean checkPalindrome(String string) {
        Queue<Character> queue = new LinkedList<Character>();
        for (int i = string.length() - 1; i >= 0; i--) {
            queue.add(string.charAt(i));
        }
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != queue.remove()) return false;
        }
        return true;
    }
}
