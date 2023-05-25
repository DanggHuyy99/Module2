package ex8;

import randomarray.CreatRandomArray;

public class Main {
    public static void main(String[] args) {
        CreatRandomArray creatRandomArray = new CreatRandomArray();
        int[] array = creatRandomArray.creatRandomArray();

        SortValueSmaller0 sortValueSmaller0 = new SortValueSmaller0();
        sortValueSmaller0.sortValueSmaller0(array);
    }
}
