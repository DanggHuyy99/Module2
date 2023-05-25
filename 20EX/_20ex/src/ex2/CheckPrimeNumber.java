package ex2;

public class CheckPrimeNumber {
    public void listOfIndexPrimeNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isPrimeNumber(array[i])){
                System.out.println("Vị trí tại " + i + " : " + array[i] + " là số nguyên tố");
            }
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
