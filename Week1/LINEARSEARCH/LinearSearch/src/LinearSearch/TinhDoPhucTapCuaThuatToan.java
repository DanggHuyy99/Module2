package LinearSearch;

import java.util.Scanner;

public class TinhDoPhucTapCuaThuatToan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi: ");
        String inputString = scanner.nextLine();

        int[] frequentChar = new int[255];
        for (int i = 0; i <inputString.length(); i++){
            int index = (int) inputString.charAt(i);
            frequentChar[index] += 1;
            System.out.println("index" + index);
        }

        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++){
            if (frequentChar[j] > max){
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
