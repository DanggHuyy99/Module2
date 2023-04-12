package codegym.array;

import java.util.Scanner;

public class GopMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size: ");
        int size = scanner.nextInt();

        int[][] arrays_1 = new int[size][size];
        int[][] arrays_2 = new int[size][size];

        for (int i = 0; i < arrays_1.length; i++) {
            for (int j = 0; j < size; j++) {
                arrays_1[i][j] = (int) (Math.random() * 100);
                arrays_2[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Mảng 1: ");
        for (int i = 0; i < arrays_1.length; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arrays_1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Mảng 2: ");
        for (int i = 0; i < arrays_2.length; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arrays_2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(arrays_1[0].length);
        System.out.println(arrays_1.length);
        int index = 0;
        int[][] arrays_3 = new int[arrays_1.length + arrays_2.length][arrays_1[0].length];
        for (int i = 0; i < arrays_1.length; i++){
            for (int j = 0; j < arrays_1[i].length; j++){
                arrays_3[index][j] = arrays_1[i][j];
            }
            index++;
        }
        for (int i = 0; i< arrays_2.length; i++){
            for (int j = 0; j < arrays_2[i].length; j++){
                arrays_3[index][j] = arrays_2[i][j];
            }
            index++;
        }
        System.out.println("Mảng 3:");
        for (int i = 0; i < arrays_3.length; i++){
            for (int j = 0; j < arrays_3[i].length; j++){
                System.out.print(arrays_3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
