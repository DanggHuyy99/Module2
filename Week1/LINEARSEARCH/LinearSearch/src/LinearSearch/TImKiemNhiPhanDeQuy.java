package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class TImKiemNhiPhanDeQuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng giá trị của mảng: ");
        int size = scanner.nextInt();
        int[] arrays = new int[size];
        int i = 0;
        do {
            System.out.print("Nhập giá trị thứ " + (i + 1) + ": ");
            arrays[i] = scanner.nextInt();
            i++;
        } while (i < size);
        for (int arr : arrays) {
            System.out.print(arr + " ");
        }
        Arrays.sort(arrays);
        System.out.println("\nMảng sau khi được sắp xếp theo thứ tự tăng dần: " + Arrays.toString(arrays));
        System.out.println("Nhập 1 số muốn tìm trong mảng:");
        int num = scanner.nextInt();
        int show = binarySearch(arrays, num);
        int count = 0;
        for (int j = 0; j < arrays.length; j++) {
            if (arrays[j] == num) {
                count++;
            }
        }
        if (count >= 1){
            System.out.println("Số muốn tìm là " + num + " nằm ở vị trí arrays[" + show + "]");
        } else {
            System.out.println("Số muốn tìm không có trong mảng");
        }
    }




    public static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (value > array[middle]) {
                left = middle + 1;
            } else if (array[middle] == value) {
                return middle;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
