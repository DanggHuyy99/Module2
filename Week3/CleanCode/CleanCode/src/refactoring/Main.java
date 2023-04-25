package refactoring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ 1:");
        int firstOpenhand = scanner.nextInt();

        System.out.println("Nhập số thứ 2:");
        int secondOpenhand = scanner.nextInt();

        System.out.println("Nhập biểu thức:");
        char operator = scanner.next().charAt(0);

        Calculator cal = new Calculator();

        System.out.println(cal.calculator(firstOpenhand,secondOpenhand,operator));
    }
}
