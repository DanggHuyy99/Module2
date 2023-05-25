package ex12;

import randomarray.CreatRandomArray;

public class Main {
    public static void main(String[] args) {
        CreatRandomArray creatRandomArray = new CreatRandomArray();
        int[] array = creatRandomArray.creatRandomArray();

        DeleteSmaller0 deleteSmaller0 = new DeleteSmaller0();
        deleteSmaller0.deleteNeg(array);
    }
}
