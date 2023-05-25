package ex5;

import randomarray.CreatRandomArray;

public class Main {
    public static void main(String[] args) {
        CreatRandomArray creatRandomArray = new CreatRandomArray();
        int[] array = creatRandomArray.creatRandomArray();

        CheckDecreseArray checkDecreseArray = new CheckDecreseArray();
        if (checkDecreseArray.checkDecreaseArray(array)) System.out.println("Mảng giảm dần");
        else System.out.println("Mảng không giảm dần");
    }
}
