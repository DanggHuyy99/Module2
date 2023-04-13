package ThuatToanSapXep;

import java.util.Scanner;

public class PracticeSapXepChen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng giá trị của mảng: ");
        int size = scanner.nextInt();
        int[] arrays = new int[size];
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Nhập giá trị thứ " + i + " : ");
            arrays[i] = scanner.nextInt();
        }
        System.out.println("Mảng ban đầu: ");
        for (int arr : arrays) {
            System.out.print(arr + " ");
        }
        insertionSort(arrays);
        System.out.println("\nMảng sau khi sắp xếp: ");
        for (int a : arrays) {
            System.out.print(a + " ");
        }
    }

    public static void insertionSort(int[] arrays) {
        int chiso, x;
        for (int i = 1; i < arrays.length; i++) {
            x = arrays[i];
            chiso = i;
            while (chiso > 0 && x < arrays[chiso - 1]) {
                arrays[chiso] = arrays[chiso - 1];
                chiso--;
            }
            arrays[chiso] = x;
        }
    }
}
