package codegym.array;

import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter size: ");
            size = scanner.nextInt();
        } while (size > 6 || size < 1);

        int max = 0;
        int[] arrays = new int[size];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 50);
        }
        for (int array : arrays) {
            System.out.print(array + " ");
        }
        int index = 1;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > max) {
                max = arrays[i];
                index = i + 1;
            }
        }
        System.out.printf("\nGía trị lớn nhất trong mảng là: %d nằm ở vị trí thứ %d", max, index);
    }
}
