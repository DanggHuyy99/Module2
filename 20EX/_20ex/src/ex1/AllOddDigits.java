package ex1;

public class AllOddDigits {
    public void listValuesWithAllOddDigits(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            boolean allOdd = true;
            while (num > 0) {
                int digit = num % 10;
                if (digit % 2 == 0) {
                    allOdd = false;
                    break;
                }
                num /= 10;
            }
            if (array[i] < 0) allOdd = false;
            if (allOdd) System.out.println(array[i]);
        }
    }
}
