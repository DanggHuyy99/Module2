package codegym.array;

import java.util.Scanner;

public class DeleteValueInArray {
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
        System.out.println("\nNhập 1 số: ");
        int number = scanner.nextInt();

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == number) {
                for (int j = i; j < arrays.length - 1; j++) {
                    arrays[j] = arrays[j + 1];
                }
                arrays[arrays.length - 1] = 0;
            }
        }
        for (int arr : arrays) {
            System.out.print(arr + " ");
        }
    }
}
