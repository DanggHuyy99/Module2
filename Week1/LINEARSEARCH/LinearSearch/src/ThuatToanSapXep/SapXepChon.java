package ThuatToanSapXep;

public class SapXepChon {
    public static void main(String[] args) {
        double[] list = {1, 5, 6.5, 7.8, -9.5, -8, 3.3};
        selectionSort(list);
        for (double a:list) {
            System.out.print(a + " ");
        }
    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double value_min = list[i];
            int index_min = i;

            for (int j = i + 1; j < list.length; j++) {
                if (value_min > list[j]) {
                    value_min = list[j];
                    index_min = j;
                }
            }
            if (index_min != i) {
                list[index_min] = list[i];
                list[i] = value_min;
            }
        }
    }
}
