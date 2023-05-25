import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        CheckRoman enterRoman = new CheckRoman();
        String roman = enterRoman.InputString();
        System.out.println(enterRoman.enterRoman(roman));

    }
}
