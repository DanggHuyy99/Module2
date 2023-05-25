package ex9;

import java.util.Arrays;

public class PosAndNeg {
    public void increasePosDecreaseNeg(int[] array) {
        int n = array.length;

        int posCount = 0;
        for (int item : array) {
            if (item > 0) {
                posCount++;
            }
        }
        int[] posArr = new int[posCount];
        int[] negArr = new int[n - posCount];
        int posIndex = 0, negIndex = 0;
        for (int value : array) {
            if (value > 0) {
                posArr[posIndex++] = value;
            } else {
                negArr[negIndex++] = value;
            }
        }

        Arrays.sort(posArr);
        for (int item : posArr) {
            System.out.print(item + ", ");
        }
        System.out.println();
        Arrays.sort(negArr);
        for (int item : negArr) {
            System.out.print(item + ", ");
        }
        System.out.println();
        reverse(negArr);

        int i = 0, j = 0, k = 0;
        while (i < posCount && j < n - posCount) {
            if (array[k] > 0) {
                array[k++] = posArr[i++];
            } else {
                array[k++] = negArr[j++];
            }
        }
        while (i < posCount) {
            array[k++] = posArr[i++];
        }
        while (j < n - posCount) {
            array[k++] = negArr[j++];
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    private static void reverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
}

