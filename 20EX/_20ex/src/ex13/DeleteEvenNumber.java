package ex13;

public class DeleteEvenNumber {
    public void deletEvenNumber(int[] array){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
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
