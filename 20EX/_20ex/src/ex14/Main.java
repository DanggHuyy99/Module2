package ex14;

import randomarray.CreatRandomArray;

public class Main {
    public static void main(String[] args) {
        CreatRandomArray creatRandomArray = new CreatRandomArray();
        int[] array = creatRandomArray.creatRandomArray();

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        removeDuplicates.removeDuplicates(array);
    }
}
