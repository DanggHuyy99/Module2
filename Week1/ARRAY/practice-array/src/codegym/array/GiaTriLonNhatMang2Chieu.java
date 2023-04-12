package codegym.array;

import java.util.Scanner;

public class GiaTriLonNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều cao");
        int chieucao = scanner.nextInt();
        System.out.println("Nhập chiều rộng");
        int chieurong = scanner.nextInt();
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
        int max = 0;
        int position_x = 0;
        int position_y = 0;
        for (int i = 0; i < chieucao; i++) {
            for (int j = 0; j < chieurong; j++) {
                if (arrays[i][j] > max){
                    max = arrays[i][j];
                    position_x = i;
                    position_y = j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max + " tại vị trí " + " arrays[" + position_x + "]" + "[" + position_y + "]");
    }
}
