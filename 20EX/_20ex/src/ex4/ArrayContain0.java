package ex4;

public class ArrayContain0 {
    public int checkContainZero(int[] array){
        for (int j : array) {
            if (j == 0) return 1;
        }
        return 0;
    }
}
