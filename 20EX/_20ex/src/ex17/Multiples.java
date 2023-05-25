package ex17;

import java.util.Scanner;

public class Multiples {
    Scanner scanner = new Scanner(System.in);

    public void mutiples() {
        System.out.println("Nhập 1 số");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
