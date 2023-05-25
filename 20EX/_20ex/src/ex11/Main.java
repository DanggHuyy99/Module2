package ex11;

import randomarray.CreatRandomArray;

public class Main {
    public static void main(String[] args) {
        CreatRandomArray creatRandomArray = new CreatRandomArray();
        int[] array = creatRandomArray.creatRandomArray();

        int[] arr = {1,2,3,4,6,7,8,9,10};
        AddX addX = new AddX();
        addX.addXtoArray(array, 15);
    }
}
