package ex10;

public class Add {
    public void add(int[] array, int number, int index) {
        int[] newArray = new int[array.length + 1];
        if (index > array.length || index < 0){
            System.out.println("Invalid index");
            return;
        }
        if (index >= 0) System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = number;
        if (array.length + 1 - (index + 1) >= 0)
            System.arraycopy(array, index + 1 - 1, newArray, index + 1, array.length + 1 - (index + 1));
        array = newArray;
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
