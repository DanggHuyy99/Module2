package ex8;

public class SortValueSmaller0 {
    public void sortValueSmaller0(int[] array){
        for (int i = 0 ; i < array.length; i++){
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] % 2 != 0 && (array[minIndex] % 2 == 0) || array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        System.out.println("Mảng sau khi được sắp xếp:");
        for (int num : array){
            System.out.print(num + " ");
        }
    }
}
