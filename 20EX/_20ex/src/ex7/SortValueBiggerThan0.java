package ex7;

public class SortValueBiggerThan0 {
    public void sortValueBiggerThan0(int[] array){
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            if (key > 0) {
                int j = i - 1;
                while (j >= 0 && array[j] > key) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = key;
            }
        }

        int i = 0;
        while (i < array.length && array[i] < 0) {
            i++;
        }
        int j = 0;
        while (i < array.length && j < i) {
            if (array[i] >= 0) {
                int temp = array[i];
                for (int k = i; k > j; k--) {
                    array[k] = array[k - 1];
                }
                array[j] = temp;
                j++;
            }
            i++;
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
