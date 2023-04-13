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
//        insertionSort(arrays);
//        bubbleSort(arrays);
        selectionSort(arrays);
        System.out.println("\nMảng sau khi sắp xếp: ");
        for (int a : arrays) {
            System.out.print(a + " ");
        }
    }

    //Sắp Xếp Chèn
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

    //Sắp Xếp Nổi Bọt
    public static void bubbleSort(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = arrays.length - 1; j > i; j--) {
                if (arrays[j] < arrays[j - 1]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[j - 1];
                    arrays[j - 1] = temp;
                }
            }
        }
    }

    //Sắp Xếp Chọn
    public static void selectionSort(int[] arrays) {
        int min;
        for (int i = 0; i < arrays.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arrays.length ; j++){
                if (arrays[j] < arrays[min])
                    min = j;
            }
            if (min != i){
                int temp = arrays[min];
                    arrays[min] = arrays[i];
                    arrays[i] = temp;
            }
        }
    }


}
