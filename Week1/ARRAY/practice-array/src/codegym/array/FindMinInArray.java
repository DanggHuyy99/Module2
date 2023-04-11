package codegym.array;

public class FindMinInArray {
    public static void main(String[] args) {
        int[] arrays = new int[5];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 100);
        }
        for (int arr:arrays){
            System.out.print(arr + " ");
        }
        int index = findMin(arrays);
        System.out.println("\nThe smallest in the array is: " + arrays[index]);
    }

    public static int findMin(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < arr[index])
                index = i;
        }
        return index;
    }
}
