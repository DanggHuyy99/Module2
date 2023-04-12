package codegym.array;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhập số lượng giá trị của mảng: ");
            size = scanner.nextInt();
        } while (size > 30);
        int[] arrays = new int[size];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 100);
        }
        for (int arr : arrays) {
            System.out.print(arr + " ");
        }
        int min = arrays[0];
        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] < min){
                min = arrays[i];
            }
        }
        System.out.println("\nGiá trị nhỏ nhất trong mảng là: " + min);
    }
}
