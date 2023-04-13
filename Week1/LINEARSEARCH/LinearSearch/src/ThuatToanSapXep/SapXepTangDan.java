package ThuatToanSapXep;

public class SapXepTangDan {
    public static void main(String[] args) {
        int[] list = {1, 5, 8, 9, 45, 78, 45, 12, 45, 9, 3, 7, 6};
        bubbleSort(list);
        for (int a:list) {
            System.out.print(a + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        boolean needNextPass = true;

        for (int i = 1; i < array.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}
