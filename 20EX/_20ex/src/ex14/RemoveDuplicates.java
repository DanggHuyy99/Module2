package ex14;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public void  removeDuplicates(int[] array){
        Set<Integer> set = new HashSet<>();
        for (int j : array) {
            set.add(j);
        }
        int[] newArr = new int[set.size()];
        int i = 0;
        for (int value : set){
            newArr[i++] = value;
        }
        for (int value : newArr){
            System.out.print(value + " ");
        }
    }
}
