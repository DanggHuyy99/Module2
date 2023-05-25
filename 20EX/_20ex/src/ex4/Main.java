package ex4;

import randomarray.CreatRandomArray;

public class Main {
    public static void main(String[] args) {
        CreatRandomArray creatRandomArray = new CreatRandomArray();
        int[] array = creatRandomArray.creatRandomArray();

        ArrayContain0 arrayContain0 = new ArrayContain0();
        System.out.println(arrayContain0.checkContainZero(array));
    }
}
