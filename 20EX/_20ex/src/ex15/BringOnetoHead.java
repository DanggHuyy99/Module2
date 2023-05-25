package ex15;

public class BringOnetoHead {
    public void bringOneToHead(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            if (array[left] == 1) {
                left++;
            } else if (array[right] == 1) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
            }
            right--;
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
