package ex7;

import randomarray.CreatRandomArray;

public class Main {
    public static void main(String[] args) {
        CreatRandomArray creatRandomArray = new CreatRandomArray();
        int[] array = creatRandomArray.creatRandomArray();

        SortValueBiggerThan0 sortValueBiggerThan0 = new SortValueBiggerThan0();
        sortValueBiggerThan0.sortValueBiggerThan0(array);
    }
}
