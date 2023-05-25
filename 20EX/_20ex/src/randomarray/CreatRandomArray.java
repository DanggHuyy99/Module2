package randomarray;

import java.util.Random;
import java.util.Scanner;

public class CreatRandomArray {

    public int[] creatRandomArray() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int MAX = 50;
        int MIN = -50;
        int size;
        do {
            System.out.println("Nhập số lượng phần tử");
            size = Integer.parseInt(scanner.nextLine());
        } while (size < 0);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(MAX - MIN + 1) + MIN;
        }
        System.out.println("Mảng sau khi được khởi tạo:");
        for (int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }
}
