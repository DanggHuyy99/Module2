package codegym.vn;

import java.text.DecimalFormat;
import java.util.Random;

public class TotalAndAverage {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random_input = new Random();

        for (int i = 0; i < arr.length; i++){
            arr[i] = random_input.nextInt(100);
//            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }

        int total = 0;
        int multiplication = 1;
        int count = 0;
        double average = 0;
        for (int i = 0; i < arr.length; i += 2){
            if (arr[i] % 2 == 1){
                System.out.println("\nSố lẻ nằm ở vị trí thứ " + i + ": " + arr[i]);
                total += arr[i];
                multiplication *= arr[i];
                count++;
                average = (double) total / count;
            }
        }
        System.out.println();
        System.out.printf("Tổng: %d\n", total);
        System.out.printf("Tích: %d\n", multiplication);

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Giá trị trung bình: "+ df.format(average));
        System.out.printf("Giá trị trung bình: %.2f\n", average );
    }
}
