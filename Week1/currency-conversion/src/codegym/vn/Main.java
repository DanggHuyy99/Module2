package codegym.vn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD: ");
        usd = scanner.nextDouble();
        double quy_doi = usd * vnd;
        System.out.print("Giá trị VND: " + quy_doi);
    }
}
