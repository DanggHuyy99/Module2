package codegym.array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Enter size: ");
        size = scanner.nextInt();

        int[] arrays= new int[size];
        for (int i = 0; i < arrays.length; i++){
            arrays[i] = (int) (Math.random() * 50);
        }
        for(int array : arrays){
            System.out.print(array + " ");
        }
        System.out.println("\nReverseArray: ");
        for (int j = 0; j < arrays.length / 2; j++){
            int temp = arrays[j];
            arrays[j] = arrays[arrays.length - 1];
            arrays[arrays.length - 1] = temp;
        }
        for (int array : arrays) {
            System.out.print(array + " ");
        }
    }
}
