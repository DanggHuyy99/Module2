package palindrome;

public class Main {
    public static void main(String[] args) {
        String string = "HUY is si YUH";
        if (Palindrome.checkPalindrome(string) == true) System.out.println("Chuỗi Palindrome");
        else System.out.println("Không phải chuỗi Palindrome");
    }
}
