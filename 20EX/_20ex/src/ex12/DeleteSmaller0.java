package ex12;

public class DeleteSmaller0 {
    public void deleteNeg(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                for (int j = i; j < n - 1; j++) {
                    array[j] = array[j + 1];
                }
                n--;
                i--;
            }
        }
        int[] result = new int[n];
        System.arraycopy(array, 0, result, 0, n);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
