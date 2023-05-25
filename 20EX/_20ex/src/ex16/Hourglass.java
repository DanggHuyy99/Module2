package ex16;

import java.util.Random;
import java.util.Scanner;

public class Hourglass {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    public void hourglass(){

        System.out.println("Nhập số hàng");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột");
        int column = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[row][column];
        for (int i = 0; i < row;i++){
            for (int j = 0; j < column; j++){
                array[i][j] = random.nextInt(100)+1;
            }
        }
        int total = 0;
        int max = 0;
        int iIndex = 0;
        int jIndex = 0;
        for (int i = 0; i < row-2; i++ ){
            for (int j = 0; j < column - 2; j++){
                if (array[i][j] + array[i][j+1] + array[i][j+2] + array[i+1][j+1] + array[i+2][j] + array[i+2][j+1] + array[i+2][j+2] > max){
                    max = array[i][j] + array[i][j+1] + array[i][j+2] + array[i+1][j+1] + array[i+2][j] + array[i+2][j+1] + array[i+2][j+2];
                    iIndex = i;
                    jIndex = j;
                }
            }
        }

        for (int i = 0; i < row;i++){
            for (int j = 0; j < column; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nMax Hourglass:");
        System.out.println(array[iIndex][jIndex] + " " + array[iIndex][jIndex+1] + " " + array[iIndex][jIndex+2]);
        System.out.println("   " + array[iIndex+1][jIndex+1]);
        System.out.println(array[iIndex+2][jIndex] + " " + array[iIndex+2][jIndex+1] + " " + array[iIndex+2][jIndex+2]);
        System.out.println("\nSum: " + max);
    }
}
