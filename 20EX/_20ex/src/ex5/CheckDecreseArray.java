package ex5;

public class CheckDecreseArray {
    public boolean checkDecreaseArray(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] < array[i+1]) return false;
        }
        return true;
    }
}
