package ex13;

import randomarray.CreatRandomArray;

public class Main {
    public static void main(String[] args) {
        CreatRandomArray creatRandomArray = new CreatRandomArray();
        int[] array = creatRandomArray.creatRandomArray();

        DeleteEvenNumber deleteEvenNumber = new DeleteEvenNumber();
        deleteEvenNumber.deletEvenNumber(array);
    }
}
