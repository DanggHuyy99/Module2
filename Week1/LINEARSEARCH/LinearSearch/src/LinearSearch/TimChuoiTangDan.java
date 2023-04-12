package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TimChuoiTangDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 từ:");
        String enter_one_word = scanner.nextLine();

        char[] word_split = enter_one_word.toCharArray();
        for (int i = 0; i < word_split.length; i++) {
            System.out.print(word_split[i] + " ");
        }
        System.out.println();
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new TreeSet<>();
        for (char kytu : word_split){
            set.add(kytu);
        }
        System.out.println("set: " + set);
        for (char kytu : set){
            sb.append(kytu);
        }
        System.out.println("sb: " + sb);
        String result = sb.toString();
        System.out.printf("\n" + result);
    }
}
