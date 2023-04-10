package codegym.vn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square triangle  top");
            System.out.println("3. Draw the square triangle  bottom");
            System.out.println("4. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    for (int i = 1; i <= 3; i++){
                        for (int j = 1; j <=6; j++){
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 6; i++){
                        for (int j = 1; j < i; j++){
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 6; i++){
                        for (int j = 6; j > i; j--){
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    for (int i = 1; i <= 5; i++){
                        for (int j = 1; j < 6 - i; j++){
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập lại");
            }
        }
    }
}
