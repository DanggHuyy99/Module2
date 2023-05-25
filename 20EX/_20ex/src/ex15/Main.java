package ex15;

import randomarray.CreatRandomArray;

public class Main {
    public static void main(String[] args) {
        CreatRandomArray creatRandomArray = new CreatRandomArray();
        int[] array = creatRandomArray.creatRandomArray();

        BringOnetoHead bringOnetoHead = new BringOnetoHead();
        bringOnetoHead.bringOneToHead(array);
    }
}
