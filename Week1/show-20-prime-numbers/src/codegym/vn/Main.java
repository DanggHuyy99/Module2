package codegym.vn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 2;
        int count = 0;
        System.out.println("Nhập số lượng số nguyên tố muốn in ra màn hình: ");
        int how_many_prime = input.nextInt();

        while (count < how_many_prime){
            boolean check = true;
            for (int i = 2; i < Math.sqrt(number); i++){
                if (number % i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
