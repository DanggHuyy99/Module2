package ex2;

import ex1.AllOddDigits;
import randomarray.CreatRandomArray;

public class Main {
    public static void main(String[] args) {
        CreatRandomArray creatRandomArray = new CreatRandomArray();
        int[] array = creatRandomArray.creatRandomArray();

        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        checkPrimeNumber.listOfIndexPrimeNumber(array);
    }
}
