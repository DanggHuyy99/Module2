package LinearSearch;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TimChuoiLienTIepCoDoDaiLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi");
        String inputString = scanner.nextLine();

        char[] input_split = inputString.toCharArray();
//        for (char c:input_split) {
//            System.out.print(c + " ");
//        }

        StringBuilder sb = new StringBuilder();
        Set<Character> set = new TreeSet<>();

        for (char c:input_split) {
            set.add(c);
        }
//        System.out.println("\nset " + set);

        for (char c:set){
            sb.append(c);
        }
        System.out.println("\n" + sb);
    }
}
