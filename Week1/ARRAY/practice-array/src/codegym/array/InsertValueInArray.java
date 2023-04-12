package codegym.array;

import java.util.Scanner;

public class InsertValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scanner.nextInt();
        int[] arrays = new int[size];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 100);
        }
        for (int arr : arrays) {
            System.out.print(arr + " ");
        }
        System.out.println("\nNhập số cần chèn:");
        int number_insert = scanner.nextInt();
        System.out.println("\nNhập vị trí cần chèn:");
        int index_insert = scanner.nextInt();
        for (int i = 0; i < arrays.length; i++) {
            if (i == index_insert) {
                int temp = arrays[i];
//                int temp_2 = arrays[i + 1];
                arrays[i] = number_insert;
//                arrays[i + 1] = temp;
                for (int j = i + 1; j < arrays.length - 1; j++) {
                    arrays[j] = temp;
//                    arrays[j + 2] = arrays[j];
                    temp = arrays[j + 1];
                }
            }
        }
        for (int arr : arrays) {
            System.out.print(arr + " ");
        }
    }
    public static int name(float a){
        return 5;
    }
    public static int name(double c){
        return 5;
    }
}
