package ex11;

public class AddX {
    public void addXtoArray(int[] array, int x){
        int[] result = new int[array.length + 1];
        int i = 0;
        while (i < array.length && array[i] < x) {
            result[i] = array[i];
            i++;
        }
        result[i] = x;
        while (i < array.length) {
            result[i + 1] = array[i];
            i++;
        }
        for (int value:result) {
            System.out.print(value + " ");
        }
    }
}
