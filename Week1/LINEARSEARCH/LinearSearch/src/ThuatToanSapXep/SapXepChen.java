package ThuatToanSapXep;

public class SapXepChen {
    public static void main(String[] args) {
    int[] arr = {1,45,7,2,7,2,275,56};
    insertionSort(arr);
        for (int a:arr) {
            System.out.print(a + " ");
        }
    }

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }
}
