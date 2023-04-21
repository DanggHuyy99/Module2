package interfacee.comparable.shape;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[4];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.9);
        circles[3] = new ComparableCircle(3.9);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        int num = circles[0].compareTo(circles[1]);
//        System.out.println(num);
        System.out.println(circles[0].toString() + check(num) + circles[1].toString());

        int num1 = circles[0].compareTo(circles[2]);
//        System.out.println(num1);
        System.out.println(circles[0].toString() + check(num1) + circles[2].toString());

        int num2 = circles[2].compareTo(circles[3]);
        System.out.println(circles[2].toString() + check(num2) + circles[3].toString());

    }

    public static String check(int num) {
        switch (num) {
            case 1:
                return " Lớn hơn ";
            case -1:
                return " Bé hơn ";
            case 0:
                return " Bằng ";
            default:
                return " Invalid ";
        }
    }
}
