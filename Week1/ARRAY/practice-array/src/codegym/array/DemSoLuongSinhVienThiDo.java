package codegym.array;

import java.util.Scanner;

public class DemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhập số lượng sinh viên: ");
            size = scanner.nextInt();
        } while (size > 30);
        int[] arrays = new int[size];
        int count = 0;
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 10);
            if (arrays[i] >= 5 && arrays[i] <= 10) {
                System.out.println("Điểm đạt của sinh viên thứ " + (i + 1) + ": " + arrays[i]);
                count++;
            }
        }
        System.out.println("Số lượng sinh viên có điểm đạt là " + count);
    }
}
