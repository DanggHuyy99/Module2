package codegym.array;

import java.util.Scanner;

public class TongCacSoOCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chieucao, chieurong;
        do {
            System.out.println("Nhập chiều cao mảng: ");
            chieucao = scanner.nextInt();
            System.out.println("Nhập chiều rộng mảng: ");
            chieurong = scanner.nextInt();
        } while (chieucao != chieurong);

        int[][] arrays = new int[chieucao][chieurong];

        for (int i = 0; i < chieucao; i++) {
            for (int j = 0; j < chieurong; j++) {
                arrays[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < chieucao; i++) {
            for (int j = 0; j < chieurong; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }

        int total = 0;
        int column;
        do {
            System.out.println("Nhập cột cần tính tổng: ");
            column = scanner.nextInt();
        } while (column > chieucao - 1 || column < 0);

        for (int i = 0; i < chieucao; i++) {
            total += arrays[i][column];
        }
        System.out.println("Tổng của cột cần tính là: " + total);
    }
}
