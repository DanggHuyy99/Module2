package codegym.vn;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Nhập a: ");
        a = input.nextInt();
        System.out.println("Nhập b: ");
        b = input.nextInt();
        int c = a * b;

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Ước chung lớn nhất của 2 số a và b là: " + a);
        System.out.println("Bội chung nhỏ nhất của 2 số a và b là: " + c / a);
    }
}
