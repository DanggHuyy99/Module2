package LinearSearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch(list, 79)); /*12 */
        System.out.println(binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch(list, 5));  /*-1 */
        System.out.println(binarySearch(list, 80));
        System.out.println();
        System.out.println(binarySearch_2(list, 66));
        System.out.println(binarySearch_2(list, 4));
        System.out.println(binarySearch_2(list, 87));
        System.out.println(binarySearch_2(list, 70));
    }

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1; /* Now high < low, key not found */
    }

    static int binarySearch_2(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (key > list[mid])
                low = mid + 1;
            else if (key == list[mid])
                return mid;
            else
                high = mid - 1;
        }
        return -1;
    }
}
