package ex9;

import ex8.SortValueSmaller0;
import randomarray.CreatRandomArray;

public class Main {
    public static void main(String[] args) {
        CreatRandomArray creatRandomArray = new CreatRandomArray();
        int[] array = creatRandomArray.creatRandomArray();

        PosAndNeg posAndNeg = new PosAndNeg();
        posAndNeg.increasePosDecreaseNeg(array);
    }
}
