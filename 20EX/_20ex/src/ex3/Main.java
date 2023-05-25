package ex3;

import randomarray.CreatRandomArray;

public class Main {
    public static void main(String[] args) {
        CreatRandomArray creatRandomArray = new CreatRandomArray();
        int[] array = creatRandomArray.creatRandomArray();

        EndWithFive endWithFive = new EndWithFive();
        endWithFive.checkEndWithFive(array);
    }
}
