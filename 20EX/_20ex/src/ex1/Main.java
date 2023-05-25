package ex1;

import randomarray.CreatRandomArray;

public class Main {
    public static void main(String[] args) {
        CreatRandomArray creatRandomArray = new CreatRandomArray();
        int[] array = creatRandomArray.creatRandomArray();

        AllOddDigits allOddDigits = new AllOddDigits();
        System.out.println("\nCác giá trị toàn sổ lẻ trong mảng:");
        allOddDigits.listValuesWithAllOddDigits(array);
    }
}
