package tamgiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh 1 của tam giác:");
        double canh1 = scanner.nextDouble();
        System.out.println("Nhập cạnh 2 của tam giác:");
        double canh2 = scanner.nextDouble();
        System.out.println("Nhập cạnh 3 của tam giác:");
        double canh3 = scanner.nextDouble();
        Triangle triangle = new Triangle(canh1, canh2, canh3);
        System.out.println("Nhập màu cho tam giác:");
        scanner.nextLine();

        String color = scanner.nextLine();
        triangle.setColor(color);
        System.out.println("Tam giác có cạnh 1 là: " + triangle.getSide1() + "\ncạnh 2 là: " + triangle.getSide2() + "\ncạnh 3 là: " + triangle.getSide3() + "\nMàu sắc: " + triangle.getColor() +
                "\nDiện tích tam giác là: " + triangle.getArea());
    }
}
