package codegym.vn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        money = scanner.nextDouble();

        System.out.println("Enter number of months: ");
        month = scanner.nextInt();

        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = scanner.nextDouble();

        double total_interest = 0;
        for (int i = 0; i < month; i++) {
            total_interest += money * (interestRate / 100) / 12 * month;
        }

        System.out.println("Total of interest: " + total_interest);
    }
}
