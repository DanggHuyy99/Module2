package ex6;

import ex5.CheckDecreseArray;
import randomarray.CreatRandomArray;

public class Main {
    public static void main(String[] args) {
        CreatRandomArray creatRandomArray = new CreatRandomArray();
        int[] array_a = creatRandomArray.creatRandomArray();
        int[] array_b = creatRandomArray.creatRandomArray();

        CheckArrayAInArrayB checkArrayAInArrayB = new CheckArrayAInArrayB();
        if (checkArrayAInArrayB.checkArrayAInArrayB(array_a, array_b)) System.out.println("Các phần tử của mảng A nằm trong mảng B");
        else System.out.println("Các phần tử của mảng A không nằm trong mảng B");
    }
}
