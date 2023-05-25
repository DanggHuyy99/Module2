package ex18;

import java.util.Scanner;

public class Substring {
    Scanner scanner = new Scanner(System.in);
    public String stringToSubString(){
        System.out.println("Nhập chuỗi");
        String chuoi = scanner.nextLine();
        System.out.println("Nhập index start");
        int startIndex = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập index end");
        int endIndex = Integer.parseInt(scanner.nextLine());
        String substring = chuoi.substring(startIndex, endIndex);
        return substring;
    }
}
