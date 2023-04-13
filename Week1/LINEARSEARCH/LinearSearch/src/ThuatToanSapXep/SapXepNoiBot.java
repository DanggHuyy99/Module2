package ThuatToanSapXep;

import java.util.Scanner;

public class SapXepNoiBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        bubbleSortByStep(list);
        for (int a : list) {
            System.out.print(a + " ");
        }
    }

    public static void bubbleSortByStep(int[] array) {
        boolean check = true;
        for (int k = 1; k < array.length && check; k++) {
            check = false;
            for (int i = 0; i < array.length - k; i++) {
                if (array[i] > array[i + 1]) {
                    System.out.println("Swap " + array[i] + " with " + array[i + 1]);
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    check = true;
                }
            }
            if (check == false) {
                System.out.println("Mảng đã được sắp xếp");
                break;
            }

            System.out.print("Sau khi sắp xếp lần thứ " + k + " : ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
            System.out.println();
        }
    }
}
